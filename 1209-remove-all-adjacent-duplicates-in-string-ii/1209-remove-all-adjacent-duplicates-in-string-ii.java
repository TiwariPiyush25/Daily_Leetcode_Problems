class Solution {
    public class pair{
        char ch;
        int fre;

        pair(char ch,int fre){
            this.ch = ch;
            this.fre = fre;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<pair>  st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(st.isEmpty() || st.peek().ch != ch){
                st.push(new pair(ch,1));
            }
            else {
                int fre = st.peek().fre;
                st.peek().fre = fre+1;

                if(st.peek().fre == k) st.pop();
            }
        } 

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            pair p = st.pop();
            int fre = p.fre;

            while(fre-->0){
                sb.append(p.ch);
            }
        }
        return sb.reverse().toString();
    }
}