class Solution {
    public boolean helper(int i,int[] arr,long p,long t){
        if(i == arr.length ||  p > t) {
            if(p == t) return true;
            return false;
        }

        boolean take = helper(i + 1, arr, p * arr[i], t);
        boolean skip = helper(i + 1, arr, p, t);

        return skip || take;
    }
    public boolean checkEqualPartitions(int[] nums, long target) {
        long x = target;
        if(target > 1) x--;
        long Prod = 1;
        for(int ele : nums){
            Prod = (Prod * ele) % x;
        }
        return Prod == 1 && helper(0,nums,1L,target);
    }
}