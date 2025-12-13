class pair implements Comparable<pair>{
    String val;
    int len;

    pair(String v,int l){
        this.val = v;
        this.len = l;
    }

    public int compareTo(pair p){
        if(this.len == p.len){
            String v1 = "";
            String v2 = "";
            for(int i=0;i<p.len;i++){
                if(this.val.charAt(i)!=p.val.charAt(i)) {
                    v1 += this.val.charAt(i);
                    v2 += p.val.charAt(i);
                    break;
                }
            }
            if(v1.length()==0) return 0;
            return Integer.valueOf(v1) - Integer.valueOf(v2);
        }
        return this.len - p.len;
    }
}
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<pair> heap = new PriorityQueue<>();
        for(String s:nums){
            heap.add(new pair(s,s.length()));

            if(heap.size()>k) heap.remove();
        }

        return heap.peek().val;
    }
}