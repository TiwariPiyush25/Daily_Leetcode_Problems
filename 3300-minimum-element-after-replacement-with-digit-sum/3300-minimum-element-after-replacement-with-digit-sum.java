class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;

        for(int ele:nums){
            int sum  = 0;

            while(ele>0){
                int ld = ele % 10;
                sum+=ld;
                ele/=10;
            }
            
            min = Math.min(min,sum);
        }

        return min;
    }
}