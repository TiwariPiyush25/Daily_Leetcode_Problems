class Solution {
    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int vowelStrings(String[] words, int left, int right) {  
        int counter = 0;
        while(left <= right){
            if(isVowel(words[left].charAt(0)) && isVowel(words[left].charAt(words[left].length()-1))) counter++;

            left++;
        }

        return counter;
    }
}