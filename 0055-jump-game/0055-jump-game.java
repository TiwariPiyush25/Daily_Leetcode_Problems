class Solution {
    public boolean Jump(int idx,int[] arr,HashMap<Integer,Boolean> dp){
        if(idx >= arr.length) return false;
        if(idx == arr.length-1) return true;
        
        if(dp.containsKey(idx)) return dp.get(idx);
        boolean flag = false;
        for(int i=arr[idx];i>=1;i--){
            flag = Jump(idx + i,arr,dp);
            if(flag) {
                dp.put(idx+i,flag);
                return true;
            }
        }

        dp.put(idx,flag);
        return flag;
    }
    public boolean canJump(int[] nums) {
        HashMap<Integer,Boolean> dp = new HashMap<>();

        return Jump(0,nums,dp);
    }
}