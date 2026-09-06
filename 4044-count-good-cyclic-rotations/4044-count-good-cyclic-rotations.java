class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        long firsthalfSum = 0;
        long secondhalfSum = 0;

        for(int i = 0;i < n;i++){
            if(i < n/2) firsthalfSum += nums[i];
            else secondhalfSum += nums[i];
        }
        
        int counter = 0;

        int i = 0 ,j = n / 2;
        while(j < n){
            int x = nums[i], y = nums[j];

            if(firsthalfSum != secondhalfSum) counter++;

            firsthalfSum -= x; firsthalfSum += y;
            secondhalfSum -= y; secondhalfSum += x;

            i++; j++;
        }

        return counter;
    }
}