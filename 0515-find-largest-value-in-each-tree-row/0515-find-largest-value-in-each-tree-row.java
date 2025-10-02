class Solution {
    public int height(TreeNode root){
        if(root==null) return 0;

        return 1+Math.max(height(root.left),height(root.right));
    }
    public void inorder(TreeNode root,int n,List<Integer> ans){
        if(root==null) return;

        inorder(root.left,n-1,ans);
        int val=ans.get(n);
        ans.set(n,Math.max(val,root.val));
        inorder(root.right,n-1,ans);
    }
    public List<Integer> largestValues(TreeNode root) {
        int height=height(root);
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<height;i++){
            ans.add(Integer.MIN_VALUE);
        }
        inorder(root,height-1,ans);
        Collections.reverse(ans);
        return ans;
    }
}