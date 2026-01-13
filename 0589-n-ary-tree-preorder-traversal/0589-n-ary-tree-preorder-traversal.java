/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public void dfs(Node root,List<Integer> lst){
        if(root==null) return;

        for(Node node:root.children){
            lst.add(node.val);
            dfs(node,lst);
        }
    }
    public List<Integer> preorder(Node root) {
        List<Integer> lst=new ArrayList<>();
        if(root!=null) lst.add(root.val);

        dfs(root,lst);
        return lst;
    }
}