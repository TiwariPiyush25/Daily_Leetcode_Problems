class Solution {
    public int findMaxLength(int[] nums) {
        //       sum      index
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;

        map.put(sum,-1);
        int maxlen = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) sum--;
            else sum++;

            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                maxlen = Math.max(maxlen,len);
            }
            else map.put(sum,i);
        }

        return maxlen;
    }
}