class Solution {
    public void rec(TreeNode root,int t,List<Integer> path,List<List<Integer>> ans){
        if(root == null) return;
        if(root.left == null && root.right == null){
            path.add(root.val);
            if(root.val == t){
                List<Integer> copy = new ArrayList<>();
                for(int ele:path) copy.add(ele);
                ans.add(copy);
            }

            path.remove(path.size()-1);
            return;
        }

        path.add(root.val);
        rec(root.left,t - root.val,path,ans);
        rec(root.right,t - root.val,path,ans);
        path.remove(path.size()-1); //  backtrack
    }
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        rec(root,target,new ArrayList<>(),ans);
        return ans;
    }
}