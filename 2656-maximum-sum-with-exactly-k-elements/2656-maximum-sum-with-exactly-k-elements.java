class Solution {
    public int maximizeSum(int[] nums, int k) {
       int max = 0;
        for(int ele:nums){
            max = Math.max(max,ele);
        } 
        int maximumScore = 0;
        while(k-- > 0){
            maximumScore+= max;
            max++;
        }

        return maximumScore;
    }
}