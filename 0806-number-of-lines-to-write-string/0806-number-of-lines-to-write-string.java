class Solution {
    public int[] numberOfLines(int[] arr, String s) {
        int pixel = 0;
        int line = 0;
        for(int i=0;i<s.length();i++){
            if(pixel + arr[s.charAt(i) - 97] > 100){
                line++;
                pixel = arr[s.charAt(i) - 97];
            }
            else {
                pixel += arr[s.charAt(i) - 97];
            }
        }

        int[] ans = {line+1,pixel};

        return ans;
    }
}