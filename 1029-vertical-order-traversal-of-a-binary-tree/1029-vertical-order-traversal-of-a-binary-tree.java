class triplet implements Comparable<triplet>{
    int val;
    int ver;
    int lvl;

    triplet(int val,int ver,int lvl){
        this.val = val;
        this.ver = ver;
        this.lvl = lvl;
    }

    public int compareTo(triplet t){
        if(this.lvl == t.lvl) return this.val - t.val;
        return this.lvl - t.lvl;
    }
}
class Solution {
    public int smallest;
    public int biggest;
    public void inorder(TreeNode root, int n, int ver,PriorityQueue<triplet> p){
        if(root==null) return;

        if(ver<smallest) smallest = ver;
        if(ver>biggest) biggest = ver;

        inorder(root.left,n+1,ver-1,p);
        p.add(new triplet(root.val,ver,n));
        inorder(root.right,n+1,ver+1,p);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        smallest = Integer.MAX_VALUE;
        biggest = Integer.MIN_VALUE;

        PriorityQueue<triplet> p=new PriorityQueue<>();
        inorder(root,0,0,p);

        List<List<Integer>> ans = new ArrayList<>();
        for(int i=smallest; i<=biggest; i++) ans.add(new ArrayList<>());

        while(!p.isEmpty()){
            triplet t = p.remove();
            int val = t.val;
            int idx = t.ver + Math.abs(smallest);
           
            ans.get(idx).add(val);
        }

        return ans;
    }
}