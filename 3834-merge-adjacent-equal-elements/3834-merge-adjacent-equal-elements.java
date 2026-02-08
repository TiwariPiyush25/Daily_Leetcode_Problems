class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st = new Stack<>();

        for(int i=0;i<nums.length;i++){
            if(!st.isEmpty() && st.peek()==nums[i]){
                long val = nums[i];
                while(!st.isEmpty() && st.peek()==val){
                    st.pop();
                    val = val * 2;
                }
                st.push(val);
            }
            else{
                st.push((long)nums[i]);
            }
        }
        
        List<Long> ans = new ArrayList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        Collections.reverse(ans);

        return ans;
    }
}