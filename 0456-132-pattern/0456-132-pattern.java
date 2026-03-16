class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int c = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i = n-1;i>=0;i--){
            if(nums[i] < c) { // we get the 132 pattern
                return true;
            }

            while(!st.isEmpty() && st.peek() < nums[i]){
                c = st.pop();
            }

            st.push(nums[i]);
        }

        return false;
    }
}