class Solution {
    public int reverseDegree(String s) {
        int sum=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int No=123 - (int)ch;
            sum +=  No * (i+1);
        }

        return sum;
    }
}