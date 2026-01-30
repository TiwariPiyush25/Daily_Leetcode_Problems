class Solution {
    public int singleNonDuplicate(int[] arr) {
        int uni = 0;

        for(int ele:arr) uni ^= ele;

        return uni;
    }
}