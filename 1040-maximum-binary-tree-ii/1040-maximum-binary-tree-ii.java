class Solution {
    public TreeNode buildTree(ArrayList<Integer> arr,int st,int end){
        if(st>end) return null;

        int max=Integer.MIN_VALUE;
        int maxidx=-1;
        for(int i=st;i<=end;i++){
            if(arr.get(i)>max){
                max=arr.get(i);
                maxidx=i;
            }
        }

        TreeNode root=new TreeNode(max);

        TreeNode leftTree = buildTree(arr,st,maxidx-1);
        TreeNode rightTree = buildTree(arr,maxidx+1,end);

        root.left = leftTree;
        root.right = rightTree;

        return root;
    }
    public void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return;

        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if(root.val<val) {
            TreeNode newroot=new TreeNode(val);
            newroot.left=root;

            return newroot;
        }
        
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);

        arr.add(val);
        root=buildTree(arr,0,arr.size()-1);
        return root;
    }
}