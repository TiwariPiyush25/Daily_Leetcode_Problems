class Solution {
    public boolean isOneBitCharacter(int[] arr) {
        int i = 0;
        while(i<arr.length-1){
            if(arr[i] == 1) i+=2;
            else i++; 
        }

        return i==arr.length-1;
    }
}