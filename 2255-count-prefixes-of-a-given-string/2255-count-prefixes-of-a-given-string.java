class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(String x : words){
            int len = x.length();
            if(len <= s.length() && x.equals(s.substring(0,len))) count++;
        }
        return  count;
    }
}