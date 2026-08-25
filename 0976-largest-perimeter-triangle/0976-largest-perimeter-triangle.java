class Solution {
    public boolean isTriangle(int a,int b,int c) {
        return (a + b) > c && (b + c) > a && (a + c) > b;
    }
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int maxPerimeter = 0;
        int n = nums.length;
        for(int i = n-3;i >= 0;i--){
            if(isTriangle(nums[i],nums[i+1],nums[i+2])){
                int p = nums[i] + nums[i+1] + nums[i+2];
                return p;
            }
        }

        return 0;
    }
}