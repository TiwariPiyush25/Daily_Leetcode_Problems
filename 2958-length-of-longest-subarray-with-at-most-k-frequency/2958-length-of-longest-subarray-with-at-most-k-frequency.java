class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        int st = 0;
        int end = 0;
        int maxSize = 0;

        while(end < n){
            
            int f = map.getOrDefault(nums[end] , 0) + 1;
            map.put(nums[end] , f);

            int size = end - st;
            maxSize = Math.max(size , maxSize);

            while(map.size() > 0 && map.get(nums[end]) > k){
                int x = map.get(nums[st]);
                if(x == 1) map.remove(nums[st]);
                else map.put(nums[st] , x - 1);

                st++;
            }

            end++;
        }
        int size = end - st;
        maxSize = Math.max(size , maxSize);

        return maxSize;
    }
}