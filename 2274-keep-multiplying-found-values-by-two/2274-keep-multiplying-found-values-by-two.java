class Solution {
    public int findFinalValue(int[] nums, int val) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums) set.add(ele);

        while(set.contains(val)){
            val=val*2;
        }

        return val;
    }
}