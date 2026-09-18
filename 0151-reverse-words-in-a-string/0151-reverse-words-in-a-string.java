class Solution {
    public String reverseWords(String s) {
        String ans = "";

        int j = 0;
        while(j < s.length()){
            while(j < s.length() && s.charAt(j) == ' ') j++;

            int i  = j;
            String temp = "";
            while(j < s.length() && s.charAt(j) != ' ') {
                temp += s.charAt(j);
                j++;
            }

            ans = " " + temp + ans;
        }

        return ans.trim();
    }
}