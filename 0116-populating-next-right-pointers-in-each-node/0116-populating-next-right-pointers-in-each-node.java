/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public List<List<Node>> lvlOrder(Node root){
        List<List<Node>> ans=new ArrayList<>();

        Queue<Node> Q=new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty()){
            int size=Q.size();
            List<Node> lst=new ArrayList<>();

            for(int i=0;i<size;i++){
                Node temp=Q.remove();

                if(temp.left!=null) Q.add(temp.left);
                if(temp.right!=null) Q.add(temp.right);

                lst.add(temp);
            }

            ans.add(lst);
        }

        return ans;
    }
    public Node connect(Node root) {
        if(root==null) return root;
        
        List<List<Node>> ans = lvlOrder(root);

        for(List<Node> lst:ans){
            for(int i=0;i<lst.size()-1;i++){
                lst.get(i).next=lst.get(i+1);
            }
        }

        return root;
    }
}