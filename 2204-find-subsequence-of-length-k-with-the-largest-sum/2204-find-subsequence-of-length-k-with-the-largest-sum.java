class pair implements Comparable<pair> {
    int val;
    int idx;

    pair(int v, int i) {
        this.val = v;
        this.idx = i;
    }

    public int compareTo(pair p) {
        return this.val - p.val;
    }
}

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<pair> p = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            p.add(new pair(nums[i], i));
            nums[i] = Integer.MAX_VALUE;

            if (p.size() > k)
                p.remove();
        }

        int[] ans = new int[k];

        while (!p.isEmpty()) {
            pair temp = p.remove();
            int val = temp.val;
            int idx = temp.idx;

            nums[idx] = val;
        }

        int i = 0;
        for (int ele : nums) {
            if (ele != Integer.MAX_VALUE)
                ans[i++] = ele;
        }

        return ans;
    }
}