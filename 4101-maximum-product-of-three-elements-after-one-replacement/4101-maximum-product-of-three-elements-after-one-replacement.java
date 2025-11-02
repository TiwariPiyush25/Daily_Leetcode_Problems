class Solution {
    public long maxProduct(int[] nums) {
        int a=Integer.MIN_VALUE;
        int b=Integer.MIN_VALUE;
        for(int ele:nums){
            if((int)Math.abs(ele)>a){
                b=a;
                a=(int)Math.abs(ele);
            }
            else if((int)Math.abs(ele)>b){
                b=(int)Math.abs(ele);
            }
        }

        return  (long) a*b* 100000;
    }
}