class Solution {
    public boolean detectCapitalUse(String word) {
        int l=0; // lowercase count
        int U=0; // Uppercase count

        int n=word.length();
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);

            if(ch>='A' && ch<='Z') U++;
            else l++;
        }

        return U==n || l==n || (U==1 && (word.charAt(0)>='A' && word.charAt(0)<='Z'));
    }
}