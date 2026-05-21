class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr=sentence.split(" ");
        int i = 0;
        for(String s : arr){
            int len = searchWord.length();
            if(len<= s.length() && searchWord.equals(s.substring(0,len))) return i+1;
            i++;
        }

        return -1;
    }
}