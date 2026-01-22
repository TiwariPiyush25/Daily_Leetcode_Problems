class Solution {
    public class pair implements Comparable<pair>{
        double x;
        double y;

        pair(double x,double y){
            this.x = x;
            this.y = y;
        }

        public int compareTo(pair p){
            return Double.compare((this.x/this.y),(p.x/p.y));
        }
    }
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<pair> p = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                p.add(new pair((double)arr[i],(double)arr[j]));

                if(p.size()>k) p.remove();
            }
        }

        int[] ans = {(int)p.peek().x,(int)p.peek().y};
        return ans;
    }
}