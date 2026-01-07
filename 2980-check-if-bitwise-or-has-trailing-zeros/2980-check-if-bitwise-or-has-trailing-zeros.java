class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        // If we have Two even Numbers, If we perform OR Operation On these numbers than we get always a trailing Zero
        int count = 0;
        for(int ele:nums){
            if(ele %2 == 0) count++;
        }

        return count > 1;
    }
}