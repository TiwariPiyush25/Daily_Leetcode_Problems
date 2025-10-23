class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()!=2){
            String res="";
            for(int i=1;i<s.length();i++){
                int v1=(int)s.charAt(i-1) - '0';
                int v2=(int)s.charAt(i) - '0';
                res += (v1 + v2) % 10;
            }

            s = res;
        }
        return s.charAt(0) == s.charAt(1);
    }
}