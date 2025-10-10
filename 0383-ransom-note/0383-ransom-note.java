class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr1=new int[26];
        int[] arr2=new int[26];

        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            int idx=(int) ch - 97;

            arr1[idx]++;
        }

        for(int i=0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            int idx=(int) ch - 97;

            arr2[idx]++;
        }

        for(int i=0;i<26;i++){
            if(arr1[i]!=0 && arr2[i]<arr1[i]) return false;
        }

        return true;
    }
}