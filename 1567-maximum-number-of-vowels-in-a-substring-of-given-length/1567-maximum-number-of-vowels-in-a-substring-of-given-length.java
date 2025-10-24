class Solution {
    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    public int maxVowels(String s, int k) {
        int count=0;
        int maxCount=0;

        int st=0;
        int end=0;
        while(end<k){
            char ch=s.charAt(end);
            if(isVowel(ch)) count++;
            end++;
        }
        maxCount=count;

        while(end<s.length()){
            char ch=s.charAt(end);
            if(isVowel(ch)) count++;

            if(isVowel(s.charAt(st))) {
                count--;
            }
            maxCount=Math.max(count,maxCount);

            st++;
            end++;
        }

        return maxCount;
    }
}