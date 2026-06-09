class Solution {
    public int compare(int a,int b){
        String x = "" + a;
        String y = "" + b;

        return (x + y).compareTo(y + x);
    }
    public String largestNumber(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> compare(a,b));
        for(int ele:nums){
            pq.add(ele);
        }

        String ans = "";
        while(!pq.isEmpty()){
            ans = pq.remove() + ans;
        }

        return ans.charAt(0) == '0' ? "0" : ans;
    }
}