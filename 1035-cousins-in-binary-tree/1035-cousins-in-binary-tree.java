class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        int lev = 0 ;

        int p1 = -1 , p2 = -1;
        int l1 = -1 , l2 = -1;

        while(!q.isEmpty()){
            int size = q.size();

            while(size-->0){
                TreeNode temp=q.remove();

                if(temp.left!=null){
                    if(temp.left.val == x){
                        p1 = temp.val;
                        l1 = lev;
                    }
                    else if(temp.left.val == y){
                        p2 = temp.val;
                        l2 = lev;
                    }
                    q.add(temp.left);
                }

                if(temp.right!=null){
                    if(temp.right.val == x){
                        p1 = temp.val;
                        l1 = lev;
                    }
                    else if(temp.right.val == y){
                        p2 = temp.val;
                        l2 = lev;
                    }

                    q.add(temp.right);
                }
            }
            lev++;
        }

        return p1!=p2 && l1==l2;
    }
}