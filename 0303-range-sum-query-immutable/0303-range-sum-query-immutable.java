class NumArray {
    int[] segmentTree;
    int len;
    public void buildTree(int i,int l,int r,int[] arr){
        if (l == r){
            segmentTree[i] = arr[l];
            return;
        }

        int mid = (l + r) / 2;
        buildTree((2 * i) + 1,l,mid,arr);
        buildTree((2 * i) + 2,mid + 1,r,arr);

        segmentTree[i] = segmentTree[2 * i + 1] + segmentTree[2 * i + 2];
    }
    public int rangeSum(int st,int end,int i,int l,int r){
        if (l > end || r < st) return 0;
        if (l >= st && r <= end) return segmentTree[i];

        int mid = (l + r) / 2;
        return rangeSum(st,end,2 * i + 1,l,mid) + rangeSum(st,end,2 * i + 2,mid + 1,r);
    }

    public NumArray(int[] nums) {
        int n = nums.length;
        len = n;
        segmentTree = new int[n * 4];
        buildTree(0,0,n-1,nums);
    }
    
    public int sumRange(int left, int right) {
        return rangeSum(left,right,0,0,len-1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */