class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if((i+1)%2==0){
                int prev=s.charAt(i-1);
                int ascii=(int)(prev) + ((int) s.charAt(i) - '0');

                sb.append((char) ascii);
            }
            else sb.append(s.charAt(i));

        }

        return sb.toString();
    }
}