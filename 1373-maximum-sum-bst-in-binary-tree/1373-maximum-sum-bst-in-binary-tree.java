class Solution {
    public Map<TreeNode,int[]> map;
    public int maxSum;
    public int minValue(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;

        int minleft = minValue(root.left);
        int minright = minValue(root.right);
        int value = root.val;

        int ans = Math.min(value , Math.min(minleft,minright));
        if(!map.containsKey(root)) map.put(root,new int[]{0,0,-1,-1});

        map.get(root)[3] = ans;
        return ans;
    }
    public int maxValue(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;

        int maxleft = maxValue(root.left);
        int maxright = maxValue(root.right);
        int value = root.val;

        int ans = Math.max(value , Math.max(maxleft,maxright));
        map.get(root)[2] = ans;
        return ans;
    }
    public boolean isBST(TreeNode root){
        if(root == null) return true;

        boolean left = isBST(root.left);
        boolean right = isBST(root.right);
        
        int leftMax = root.left == null ? Integer.MIN_VALUE : map.get(root.left)[2];
        int rightMin = root.right == null ? Integer.MAX_VALUE : map.get(root.right)[3];

        if(root.val <= leftMax || root.val >= rightMin) return false;

        if(left && right) map.get(root)[1] = 1;
        return left && right; 
    }
    public int Sum(TreeNode root){
        if(root == null) return 0;

        int leftSum = Sum(root.left);
        int rightSum = Sum(root.right);
        int total = root.val + leftSum + rightSum;

        map.get(root)[0] = total;
        return total;
    }
    public void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        if(map.get(root)[1] == 1){
            maxSum = Math.max(maxSum , map.get(root)[0]);
        }
        inorder(root.right);
    }
    public int maxSumBST(TreeNode root) {
        maxSum = 0;
        map = new HashMap<>();
        minValue(root);
        maxValue(root);
        isBST(root);
        Sum(root);

        inorder(root);

        return maxSum;
    }
}