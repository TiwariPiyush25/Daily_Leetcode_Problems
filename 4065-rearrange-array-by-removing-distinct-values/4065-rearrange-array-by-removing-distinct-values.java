class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[101];

        PriorityQueue<int[]> minheap = new PriorityQueue<>((a,b) -> (a[1] == b[1]) ? a[0] - b[0] : a[1] - b[1]);
        for(int ele : nums){
            arr[ele]++;
            minheap.add(new int[]{ele , arr[ele]});
        }

        int[] ans = new int[nums.length];
        int i = 0;

        while(!minheap.isEmpty()){
            ans[i++] = minheap.remove()[0];
        }

        return ans;
    }
}