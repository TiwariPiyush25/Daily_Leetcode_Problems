class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() == 1) return "0";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k > 0 && st.peek() > num.charAt(i)){
                st.pop();
                k--;
            }

            st.push(num.charAt(i));
        }
        
        while(k-- > 0 && !st.isEmpty()){
            st.pop();
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        sb.reverse();
        int i = 0;
        while(i<sb.length() && sb.charAt(i) == '0') sb.delete(i,i+1);

        return i==sb.length() ? "0" : sb.toString();
    }
}