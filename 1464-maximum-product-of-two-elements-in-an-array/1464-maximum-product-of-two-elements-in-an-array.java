class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int s_max=Integer.MIN_VALUE;

        for(int ele:nums){
            if(ele>=max){
                s_max=max;
                max=ele;
            }
            else if(ele>s_max){
                s_max=ele;
            }
        }

        return (max-1)*(s_max-1);
    }
}