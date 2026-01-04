class Solution {
    public String largestEven(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        while(sb.length() > 0 && (int)(sb.charAt(sb.length()-1)-'0')% 2 !=0){
            sb.deleteCharAt(sb.length()-1);
        }

        return sb.toString();
    }
}