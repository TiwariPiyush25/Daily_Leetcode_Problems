class Solution {
    public int missingMultiple(int[] nums, int k) {
        int num=-1;

        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        int ans=k;
        int i=2;
        while(set.contains(ans)){
            ans=k*i;
            i++;
        }

        return ans;
    }
}