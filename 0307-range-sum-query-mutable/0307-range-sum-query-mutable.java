class Node{
    int start, end;
    int sum;
    Node left , right;

    Node(int start,int end){
        this.start = start;
        this.end = end;
        sum = 0;
        this.left = null;
        this.right = null;
    }
}

class SegmentTree {
    Node root;

    public SegmentTree(int[] nums) {
        if (nums.length > 0) {
            this.root = new Node(0, nums.length - 1);
            build(root, nums);
        }
    }

    private void build(Node node,int[] nums){
        if (node.start == node.end){
            node.sum = nums[node.start];
            return;
        }

        int mid = node.start + (node.end - node.start) / 2;
        node.left = new Node(node.start,mid);
        node.right = new Node(mid+1,node.end);

        build(node.left,nums);
        build(node.right,nums);

        node.sum = node.left.sum + node.right.sum;
    }

    public int rangeSum(Node node,int left,int right){
        if(node.start > right || node.end < left) return 0;
        if (node.start >= left && node.end <= right) return node.sum;

        return rangeSum(node.left,left,right) + rangeSum(node.right,left,right);
    }

    public void update(Node node, int index, int val) {
        if (node.start == node.end) {
            node.sum = val;
            return;
        }

        int mid = node.start + (node.end - node.start) / 2;
        if (index <= mid) {
            update(node.left, index, val);
        } else {
            update(node.right, index, val);
        }

        node.sum = node.left.sum + node.right.sum;
    }
}

class NumArray {
    SegmentTree s;
    public NumArray(int[] nums) {
       s =  new SegmentTree(nums);
    }
    
    public void update(int index, int val) {
        s.update(s.root,index,val);
    }
    
    public int sumRange(int left, int right) {
        return  s.rangeSum(s.root,left,right);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */