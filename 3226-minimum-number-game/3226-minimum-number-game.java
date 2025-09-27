class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i:nums){
            p.add(i);
        }
        
        int[] ans=new int[nums.length];
        int idx=0;
        while(!p.isEmpty()){
            int alice=p.remove();
            int bob=p.remove();

            ans[idx++]=bob;
            ans[idx++]=alice;
        }

        return ans;
    }
}