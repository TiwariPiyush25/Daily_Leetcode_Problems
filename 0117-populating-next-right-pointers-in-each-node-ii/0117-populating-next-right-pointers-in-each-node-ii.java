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
    public Node connect(Node root) {
        if(root==null) return root;
        
        Queue<Node> Q=new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty()){
            int size=Q.size();

            for(int i=0;i<size;i++){
                Node temp=Q.remove();

                if(temp.left!=null) Q.add(temp.left);
                if(temp.right!=null) Q.add(temp.right);

                if(i<size-1) temp.next=Q.peek();
            }
        }


        return root;
    }
}