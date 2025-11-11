class triplet{
    int val;
    int parent;
    int l;

    triplet(int v,int p,int l){
        this.val =v;
        this.parent = p;
        this.l = l;
    }
}
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<triplet> arr=new ArrayList<>();

        q.add(root);
        int lev = 0 ;

        while(!q.isEmpty()){
            int size = q.size();

            while(size-->0){
                TreeNode temp=q.remove();

                if(temp.left!=null){
                    arr.add(new triplet(temp.left.val,temp.val,lev));
                    q.add(temp.left);
                }

                if(temp.right!=null){
                    arr.add(new triplet(temp.right.val,temp.val,lev));
                    q.add(temp.right);
                }
            }
            lev++;
        }

        int p1 = -1;
        int p2 = -1;
        int l1 = -1;
        int l2 = -1;

        for(triplet t:arr){
            if(t.val==x){
                p1 = t.parent;
                l1 = t.l;
            }
            if(t.val == y){
                p2 = t.parent;
                l2 = t.l;
            }
        }
        return p1!=p2 && l1==l2;
    }
}