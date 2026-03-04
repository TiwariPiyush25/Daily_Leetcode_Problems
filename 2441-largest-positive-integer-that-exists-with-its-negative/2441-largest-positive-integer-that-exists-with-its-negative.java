class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int max = Integer.MIN_VALUE;
        for(int ele:nums){
            if(set.contains(ele*-1)) max = Math.max(Math.abs(ele),max);
            else set.add(ele);
        }

        return max == Integer.MIN_VALUE ? -1 : max;
    }
}