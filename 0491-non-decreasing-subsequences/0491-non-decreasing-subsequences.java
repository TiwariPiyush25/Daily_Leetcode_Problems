class Solution {
    public void helper(int i,int[] arr,List<Integer> list,HashSet<List<Integer>> ans){
        if(i == arr.length){
            if(list.size() > 1) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        // take
        int n = list.size();
        if(n == 0 || (n > 0 && arr[i] >= list.get(n-1))) list.add(arr[i]);
        helper(i+1,arr,list,ans);
        if(list.size() > n) list.removeLast();

        // skip 
        helper(i+1,arr,list,ans);
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        HashSet<List<Integer>> temp = new HashSet<>();

        helper(0,nums,new ArrayList<>(),temp);
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> l : temp){
            ans.add(l);
        }

        return ans;
    }
}