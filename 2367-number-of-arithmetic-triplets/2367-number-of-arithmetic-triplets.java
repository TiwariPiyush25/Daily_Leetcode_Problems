class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int ele:nums){
            int val = ele-diff;
            if(set.contains(val) && set.contains(val - diff)){
                count++;
            }

            set.add(ele);
        }

        return count;
    }
}