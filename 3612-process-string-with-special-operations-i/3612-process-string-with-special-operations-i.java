class Solution {
    public String processStr(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ans.append(ch);
            } 
            else if(ans.length() > 0){
                if (ch == '*') {
                    ans.delete(ans.length()-1,ans.length());
                } 
                else if (ans.length() > 0 && ch == '#') {
                    ans.append(ans);
                } 
                else {
                    ans.reverse();
                }
            }
        }

        return ans.toString();
    }
}