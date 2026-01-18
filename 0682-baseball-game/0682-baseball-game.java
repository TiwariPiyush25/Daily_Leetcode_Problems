class Solution {
    public int calPoints(String[] operations) {
        Stack<String> st = new Stack<>();

        for(String s:operations){
            if(!s.equals("+") && !s.equals("C") && !s.equals("D")){
                st.push(s);
            }
            else if(s.equals("+")){
                int v1 = Integer.parseInt(st.peek());
                String x = st.pop();
                int v2 = Integer.parseInt(st.peek());

                v1 = v1 + v2;
                String res = "" + v1;
                st.push(x);
                st.push(res);
            }
            else if(s.equals("C")){
                st.pop();
            }
            else {
                int v = Integer.parseInt(st.peek());
                v = v * 2;

                String res = "" + v;
                st.push(res);
            }
        }

        if(st.isEmpty()) return 0;
        int sum = 0;
        while(!st.isEmpty()){
            sum += Integer.parseInt(st.peek());
            st.pop();
        }
        return sum;
    }
}