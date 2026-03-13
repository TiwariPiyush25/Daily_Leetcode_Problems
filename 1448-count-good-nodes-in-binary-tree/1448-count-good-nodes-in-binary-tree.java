class Solution {
    public int cnt;
    public int maxcurr;
    public int maxprev;
    public void inorder(TreeNode root){
        if(root == null) return;

        maxprev = maxcurr;
        maxcurr = Math.max(maxcurr,root.val);
        if(maxcurr <= root.val) cnt++;
        inorder(root.left);
        inorder(root.right);
        maxcurr = maxprev;
    }
    public int goodNodes(TreeNode root) {
        maxcurr = root.val;
        maxprev = 0;
    
        cnt = 0;
        inorder(root);
        return cnt;
    }
}