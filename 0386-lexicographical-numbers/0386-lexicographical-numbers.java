class Solution {
    public void helper(int num,int limit,List<Integer> ans){
        if(num > limit) return;
        
        ans.add(num);
        for(int i = 0;i <= 9;i++){
            int next = (num * 10) + i;
            helper(next,limit,ans);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 1;i <= 9;i++) helper(i,n,ans);

        return ans;
    }
}