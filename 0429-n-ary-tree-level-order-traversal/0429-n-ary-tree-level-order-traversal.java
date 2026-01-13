class Solution {
    public int height(Node root) {
        if(root == null) return 0;
        
        int max = 0;
        for(Node child:root.children){
            max = Math.max(max,height(child));
        }

        return 1+max;
    }
    public void levelOrder(Node root,int n,int level,List<List<Integer>> ans){
        if(root == null) return;

        for(Node child:root.children){
            ans.get(level).add(child.val);
            levelOrder(child,n,level+1,ans);
        }
    }
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null) return new ArrayList<>();
        
        int n = height(root);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
        }
        ans.get(0).add(root.val);
        levelOrder(root,n,1,ans);

        return ans;
    }
}