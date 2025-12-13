class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int ele:nums){
            if(!set.contains(ele)) {
                heap.add(ele);
                set.add(ele);
            }

            if(heap.size()>k) heap.remove();
        }

        int i = heap.size()-1;
        int[] ans = new int[heap.size()];
        while(!heap.isEmpty()) ans[i--] = heap.remove();

        return ans;
    }
}