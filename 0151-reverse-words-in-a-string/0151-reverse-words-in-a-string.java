class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();

        int j = 0;
        while(j < s.length()){
            while(j < s.length() && s.charAt(j) == ' ') j++;

            int i  = j;
            StringBuilder temp = new StringBuilder();
            while(j < s.length() && s.charAt(j) != ' ') {
                temp.append(s.charAt(j));
                j++;
            }

            ans.insert(0,temp);
            ans.insert(0," ");
        }

        return ans.toString().trim();
    }
}