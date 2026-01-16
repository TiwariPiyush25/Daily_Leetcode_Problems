/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    List<Integer> lst=new ArrayList<>();

    Stack<TreeNode> st=new Stack<>();

    public BSTIterator(TreeNode root) {
        TreeNode temp=root;

        while(true){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            else{
                if(st.isEmpty()) break; // Breaking condition of Infinite loop

                TreeNode top=st.pop();
                lst.add(top.val);
                temp=top.right;
            }
        }
    }
    
    public int next() {
        int val  = lst.get(0);
        lst.remove(0);
        return val;
    }
    
    public boolean hasNext() {
        if(lst.size()!=0) return true;
        return false;
    }
}