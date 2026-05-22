class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String r = "";

        for(String x : words){
            if((r + x).length() > s.length())  break;
            r += x;
        }

        return s.equals(r);
    }
}