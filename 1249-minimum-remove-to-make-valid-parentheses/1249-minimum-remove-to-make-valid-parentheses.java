class Solution {
    public class pair{
        char ch;
        int i;

        pair(char ch,int i){
            this.ch = ch;
            this.i = i;
        }
    }
    public String minRemoveToMakeValid(String s) {
        Stack<pair> st =  new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push(new pair(ch,i));
            }
            else if(ch == ')'){
                if(!st.isEmpty() && st.peek().ch == '('){
                    st.pop();
                }
                else {
                    st.push(new pair(ch,i));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(!st.isEmpty() && st.peek().i == i){
                st.pop();
            }
            else sb.append(s.charAt(i));
        }

        return sb.reverse().toString();
    }
}