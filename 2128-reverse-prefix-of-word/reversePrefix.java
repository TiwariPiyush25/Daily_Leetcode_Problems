class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder rev=new StringBuilder();

        int i=0;
        while(i<word.length()){
            rev.append(word.charAt(i));
            if(word.charAt(i)==ch) break;

            i++;
        }

        if(i==word.length()) return word;
        return rev.reverse()+word.substring(i+1);
    }
}
