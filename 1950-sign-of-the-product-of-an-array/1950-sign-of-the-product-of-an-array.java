class Solution {
    public int arraySign(int[] nums) {
       int countnegatives=0;
       for(int ele:nums){
        if(ele==0) return 0;
        if(ele<0) countnegatives++;
       }

       if(countnegatives%2==0) return 1;
       return -1;
    }
}