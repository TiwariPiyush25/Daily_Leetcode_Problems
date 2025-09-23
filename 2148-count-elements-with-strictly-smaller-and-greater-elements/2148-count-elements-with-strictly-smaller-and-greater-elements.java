class Solution {
    public int countElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int ele:nums) if(ele>max) max=ele;
        for(int ele:nums) if(ele<min) min=ele;

        int count=0;
        for(int ele:nums){
            if(ele>min && ele<max) count++;
        }


        return count;
    }
}