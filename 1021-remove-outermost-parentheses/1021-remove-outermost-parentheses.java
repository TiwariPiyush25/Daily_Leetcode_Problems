class Solution {
    public String removeOuterParentheses(String s) {
        int open = 0;
        int close = 0;

        StringBuilder sb = new StringBuilder();
        int l = 0;
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);

            if(ch == '('){
                open++;
            }
            else{
                close++;
            }

            if(open == close){
                sb.append(s.substring(l+1,i));
                l = i + 1;
            }
        }

        return sb.toString();
    }
}