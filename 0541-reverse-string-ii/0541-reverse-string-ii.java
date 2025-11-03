class Solution {
    public String reverseStr(String s, int k) {
        String  res="";

        int i=0;
        while(i<s.length()){
            int st=i;
            String temp="";
            while(i<s.length() && i-st!=k){
                temp = s.charAt(i) + temp;
                i++;
            }
            res+=temp;

            st = i;
            temp="";
            while(i<s.length() && i-st!=k){
                res += s.charAt(i);
                i++;
            }

            res += temp;
        }

        return res;
    }
}