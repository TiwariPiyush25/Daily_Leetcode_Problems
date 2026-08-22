class Solution {
    public boolean checkString(String s) {
        boolean A = false;
        boolean B = false;

        for(int i = 0;i < s.length();i++){
            if(B && s.charAt(i) == 'a') return false;
            if(s.charAt(i) == 'a') A = true;
            if(s.charAt(i) == 'b') B = true;
        }

        return true;
    }
}