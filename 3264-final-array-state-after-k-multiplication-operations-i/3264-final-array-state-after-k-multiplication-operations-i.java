class pair implements Comparable<pair>{
    int val;
    int idx;

    pair(int v,int i){
        this.val=v;
        this.idx=i;
    }

    public int compareTo(pair p){
        if(this.val==p.val) return this.idx - p.idx;
        return  this.val - p.val;
    }
}
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<pair> heap=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            heap.add(new pair(nums[i],i));
        }

        while(k-->0){
            pair p=heap.remove();

            int val = p.val * multiplier;
            heap.add(new pair(val,p.idx));
        }

        while(!heap.isEmpty()){
            pair p = heap.remove();
            nums[p.idx] = p.val;
        }

        return nums;
    }
}