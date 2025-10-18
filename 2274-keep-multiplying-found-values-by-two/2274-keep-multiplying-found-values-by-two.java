class Solution {
    public int findFinalValue(int[] nums, int val) {
        int n=nums.length;
        while(true){
            boolean flag=false;
            for(int i=0;i<n;i++){
                if(nums[i]==val) flag=true;
            }

            if(flag) val*=2;
            else break;
        }

        return val;
    }
}