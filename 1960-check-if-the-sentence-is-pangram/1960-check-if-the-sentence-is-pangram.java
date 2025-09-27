class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;

        int[] fre=new int[26];
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            fre[(int) ch - 97]++;
        }

        for(int i:fre) if(i==0) return false;
        return true;
    }
}