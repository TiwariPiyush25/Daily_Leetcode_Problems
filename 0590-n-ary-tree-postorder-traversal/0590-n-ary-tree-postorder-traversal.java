class Solution {
    public void dfs(Node root,List<Integer> ans){
        if(root == null) return;

        for(Node child:root.children){
            dfs(child,ans);
            ans.add(child.val);
        }
    }
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root,ans);
        if(root != null) ans.add(root.val);

        return ans;
    }
}