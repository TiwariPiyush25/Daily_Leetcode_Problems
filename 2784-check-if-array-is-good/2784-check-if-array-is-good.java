class Solution {
    public boolean isGood(int[] nums) {
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int ele:nums){
            if(ele != max && set.contains(ele)) return false;
            set.add(ele);
            max = Math.max(ele , max);
        }

        for(int i=1;i<=max;i++){
            if(!set.contains(i)) return false;
        }

        int cnt = 0;
        for(int ele:nums){
            if(ele == max) cnt++;
        }
        return cnt == 2;
    }
}