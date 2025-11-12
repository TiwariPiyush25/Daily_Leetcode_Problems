class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int j = 0;


        int max=0;
        int count=0;

        while(j!=nums.length){
            int start = nums[i];
            int curr = nums[j];

            if(start==1 && curr==1){
                count++;
            } 
            else{
                i=j+1;
                count=0;
            }

            max=Math.max(max,count);
            j++;
        }

        return max;
    }
}