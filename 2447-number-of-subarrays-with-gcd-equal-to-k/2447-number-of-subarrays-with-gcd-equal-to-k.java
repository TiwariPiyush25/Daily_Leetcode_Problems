class Solution {
    public int gcd(int a,int b){
        return (a % b == 0) ? b : gcd(b , a % b);
    }
    public int subarrayGCD(int[] nums, int k) {
        int n = nums.length , counter = 0;
        for(int i = 0;i < n;i++){
            int val = nums[i];
            if(val == k) counter++;
            
            for(int j = i;j < n - 1;j++){
               val = gcd(val , nums[j + 1]);
               if(val == k) counter++;
            }
        }

        return counter;
    }
}