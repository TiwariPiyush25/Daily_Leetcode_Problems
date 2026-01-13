class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        st.push(asteroids[0]);
        for(int i=1;i<asteroids.length;i++){
            int ele = asteroids[i];
            boolean flag = true;
            while(!st.isEmpty() && st.peek()>0 && ele<0){
                int val = st.peek();

                if(Math.abs(val)>Math.abs(ele)){
                    flag = false;
                    break;
                }
                else {
                    if(Math.abs(val) == Math.abs(ele)) flag = false;
                    st.pop();

                    if(flag == false) break; // both asteroids destroyed
                }
            }

            if(flag) st.push(ele);
        }

        int[] ans = new int[st.size()];

        int i = ans.length-1;
        while(!st.isEmpty()){
            ans[i--] = st.pop();
        }
        return ans;
    }
}