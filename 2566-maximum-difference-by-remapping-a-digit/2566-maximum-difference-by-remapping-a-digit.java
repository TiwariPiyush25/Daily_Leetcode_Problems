class Solution {
    public int minMaxDifference(int num) {
        String s = ""+num;

        String val1 = "";
        String val2 = "";

        int i = 0;
        while(i < s.length() && s.charAt(i) == '9') i++;
        if(i == s.length()) return num;
        
        for(int j = 0;j < s.length();j++){
            if(s.charAt(j) == s.charAt(i)) val1 += '9';
            else val1 += s.charAt(j);

            if(s.charAt(j) == s.charAt(0)) val2 += '0';
            else val2 += s.charAt(j);
        }

        return Integer.parseInt(val1) - Integer.parseInt(val2);
    }
}