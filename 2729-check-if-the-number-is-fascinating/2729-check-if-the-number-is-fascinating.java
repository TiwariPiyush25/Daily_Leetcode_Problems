class Solution {
    public boolean isFascinating(int n) {
        String s = n + "";
        s += (2*n);
        s += (3*n);

        System.out.println(s);
        String uni = "";
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '0' || uni.indexOf(s.charAt(i)) != -1) return false;
            else uni += s.charAt(i);
        }

        return uni.length() == 9;
    }
}