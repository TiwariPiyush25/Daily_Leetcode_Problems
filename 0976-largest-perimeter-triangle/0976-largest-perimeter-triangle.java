class Solution {
    public boolean isTriangle(int a,int b,int c) {
        return (a + b) > c && (b + c) > a && (a + c) > b;
    }
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int maxPerimeter = 0;
        for(int i = 0;i < nums.length;i++){
            int j = i + 1, k = nums.length - 1;

            while(j < k){
                if(isTriangle(nums[i],nums[j],nums[k])){
                    int perimeter = nums[i] + nums[j] + nums[k];
                    maxPerimeter = Math.max(maxPerimeter ,perimeter);
                    j++;
                }
                else k--;
            }
        }

        return maxPerimeter;
    }
}