class Solution {
    public void helper(int i,int n,int k,int sum,List<Integer> arr,List<List<Integer>> ans){
        if(i == 10 || sum > n){
            if(sum == n && arr.size() == k) {
                ans.add(new ArrayList<>(arr));
            }
            return;
        }


        arr.add(i);
        helper(i + 1, n, k, sum + i, arr, ans);
        arr.remove(arr.size()-1);

        helper(i + 1, n, k, sum, arr, ans);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(1,n,k,0,new ArrayList<>(),ans);

        return ans;
    }
}