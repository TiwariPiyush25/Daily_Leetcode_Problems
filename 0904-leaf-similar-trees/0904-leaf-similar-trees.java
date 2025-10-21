class Solution {
    public void inorder(TreeNode root,List<Integer> lst){
        if(root==null) return;

        inorder(root.left,lst);
        if(root.left==null && root.right==null){ 
            lst.add(root.val);
            return;
        }
        inorder(root.right,lst);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1=new ArrayList<>();
        inorder(root1,list1);

        List<Integer> list2=new ArrayList<>();
        inorder(root2,list2);

        if(list1.size()!=list2.size()) return false;
        for(int i=0;i<list1.size();i++){
            int v1=list1.get(i);
            int v2=list2.get(i);
            if(v1!=v2) return false;
        }

        return true;
    }
}