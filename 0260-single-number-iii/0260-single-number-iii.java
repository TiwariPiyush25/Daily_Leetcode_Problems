class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        int[] ans = new int[2];
        int i = 0;
        for (int key:map.keySet()){
            if (map.get(key)==1) {
                ans[i++] = key;
            }
        }

        return ans;
    }
}