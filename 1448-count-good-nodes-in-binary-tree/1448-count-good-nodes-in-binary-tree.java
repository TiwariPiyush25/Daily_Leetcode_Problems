class Solution {
    public int cnt;
    public List<Integer> maxValueList;
    public void inorder(TreeNode root){
        if(root == null) return;

        int val = maxValueList.get(maxValueList.size()-1);
        maxValueList.add(Math.max(val,root.val));
        if(val <= root.val) cnt++;
        inorder(root.left);
        inorder(root.right);

        maxValueList.remove(maxValueList.size()-1);
    }
    public int goodNodes(TreeNode root) {
        maxValueList = new ArrayList<>();
        maxValueList.add(root.val);
        cnt = 0;
        inorder(root);
        return cnt;
    }
}