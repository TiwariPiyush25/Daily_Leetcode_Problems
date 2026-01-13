class Solution {
    public int depth(Node root){
        if(root==null) return 0;

        int max = 0;
        for(Node child:root.children){
            max = Math.max(max,1+depth(child));
        }

        return max;
    }
    public int maxDepth(Node root) {
        if(root == null) return 0;

        return 1 + depth(root);
    }
}