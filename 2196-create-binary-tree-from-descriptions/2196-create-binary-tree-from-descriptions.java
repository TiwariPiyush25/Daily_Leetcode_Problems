class Solution {
    public TreeNode helper(int temp,HashMap<Integer,int[]> map){
        if(!map.containsKey(temp)) return new TreeNode(temp);

        TreeNode root = new TreeNode(temp);
        if(map.get(temp)[0] != -1){
            root.left = helper(map.get(temp)[0],map);
        }
        if(map.get(temp)[1] != -1){
            root.right = helper(map.get(temp)[1],map);
        }

        return root;
    }
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,int[]> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int[] des : descriptions){
            int p = des[0], child = des[1], isLeft = des[2];

            if(!map.containsKey(p)) map.put(p,new int[]{-1,-1});
            map.get(p)[1 - isLeft] = child;
            set.add(child);
        }

        int temp = -1;
        for(int[] des : descriptions){
            if(!set.contains(des[0])){
                temp = des[0];
                break;
            }
        }
        TreeNode root = helper(temp,map);
        return root;
    }
}