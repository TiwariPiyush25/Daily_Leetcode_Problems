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
        PriorityQueue<pair> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<arr.length;i++){
            int st = i+1, end = arr.length-1;
            while(st<=end){
                if(st != end){
                    maxheap.add(new pair((double)arr[i],(double)arr[st]));
                    maxheap.add(new pair((double)arr[i],(double)arr[end]));
                }
                else {
                    maxheap.add(new pair((double)arr[i],(double)arr[end]));
                }

                st++;
                end--;
            }
        }

        while(maxheap.size()>k){
            maxheap.remove();
        }

        int[] ans = {(int)maxheap.peek().x,(int)maxheap.peek().y};
        return ans;
    }
}