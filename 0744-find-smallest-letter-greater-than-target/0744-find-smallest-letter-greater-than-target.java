class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int st=0;
        int end=letters.length-1;
        char ch=letters[0];
        while(st<=end){
            int mid=(st+end)/2;

            if((int) letters[mid]>(int)target){
                end=mid-1;
                ch=letters[mid];
            }
            else{
                st=mid+1;
            }
        }

        return ch;
    }
}