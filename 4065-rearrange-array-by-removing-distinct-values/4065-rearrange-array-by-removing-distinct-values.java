class Solution {
    public int[] rearrangeArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        PriorityQueue<int[]> minheap = new PriorityQueue<>((a,b) -> (a[1] == b[1]) ? a[0] - b[0] : a[1] - b[1]);

        for(int ele : nums){
            int f = map.getOrDefault(ele , 0) + 1;
            minheap.add(new int[]{ele , f});
            map.put(ele , f);
        }

        int[] ans = new int[nums.length];
        int i = 0;

        while(!minheap.isEmpty()){
            ans[i++] = minheap.remove()[0];
        }

        return ans;
    }
}