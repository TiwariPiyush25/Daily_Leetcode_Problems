class Solution {
    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();

        int count1=0;
        for(int i=0;i<s.length()/2;i++){
            char ch=s.charAt(i);

            if(isVowel(s.charAt(i))) count1++;
        }

        int count2=0;
        for(int i=s.length()/2;i<s.length();i++){
            char ch=s.charAt(i);

            if(isVowel(s.charAt(i))) count2++;
        }
        
        return count1==count2;
    }
}