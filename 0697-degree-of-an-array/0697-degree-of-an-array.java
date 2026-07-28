class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,int[]> map = new HashMap<>();
        int maxOcc = 0;
        for(int i = 0;i < nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new int[]{1,i,i});
            }
            else {
                int[] arr = map.get(nums[i]);
                arr[0]++;
                arr[2] = i;

                map.put(nums[i],arr);
            }

            maxOcc = Math.max(maxOcc , map.get(nums[i])[0]);
        } 

        int minLen = nums.length;
        for(int key : map.keySet()){
            if(map.get(key)[0] == maxOcc) minLen = Math.min(minLen , map.get(key)[2] - map.get(key)[1] + 1);
        }

        return minLen;
    }
}