class Solution {
    public int sum=0;
    public int value(String s){
        int sum=0;
        int n=s.length();
        int k=0;
        for(int i=n-1;i>=0;i--){
            sum = sum + (int) Math.pow(2,k++) *(int)  (s.charAt(i) - '0');
        }

        return sum;
    }
    public void helper(TreeNode root,String str){
        if(root==null) return;
        if(root.left==null && root.right==null){
            str+=root.val;
            sum+=value(str);
            return;
        }
        
        helper(root.left,str+root.val);
        helper(root.right,str+root.val);
    }
    public int sumRootToLeaf(TreeNode root) {
        sum=0;
        helper(root,"");
        return sum;
    }
}