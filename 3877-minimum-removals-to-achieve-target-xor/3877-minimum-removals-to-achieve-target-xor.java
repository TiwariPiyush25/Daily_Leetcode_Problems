class Solution {
    public int helper(int i,int l,int xor,int[] arr,int t,HashMap<String,Integer> dp){
        if(i==arr.length){
            if(xor == t){
                return 0;
            }
            return Integer.MIN_VALUE;
        }
        String key = i+","+xor;
        if(dp.containsKey(key)) return dp.get(key);
        int take = helper(i+1,l+1,xor ^ arr[i],arr,t,dp);
        if(take != Integer.MIN_VALUE) take = 1 + take;
        int skip = helper(i+1,l,xor,arr,t,dp);

        dp.put(i+","+xor,Math.max(take,skip));
        return Math.max(take,skip);
    }
    public int minRemovals(int[] nums, int target) {
        HashMap<String,Integer> dp = new HashMap<>();
        int maxlen = helper(0,0,0,nums,target,dp);

        if(maxlen < 0) return -1;
        return nums.length - maxlen;
    }
}