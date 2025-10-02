class Solution {
    public boolean flag;
    public HashSet<Integer> set;
    public void inorder(TreeNode root,int k){
        if(root==null) return;

        inorder(root.left,k);

        int rem=k-root.val;
        if(set.contains(rem)) flag=true;
        set.add(root.val);
        
        inorder(root.right,k);
    }
    public boolean findTarget(TreeNode root, int k) {
        set=new HashSet<>();
        flag=false;
        inorder(root,k);
        return flag;
    }
}