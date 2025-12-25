class Solution {
    public int singleNumber(int[] nums) {
        int uni = 0;
        for(int ele:nums) uni^=ele;

        return uni;
    }
}