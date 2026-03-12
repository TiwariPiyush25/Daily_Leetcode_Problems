class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        long[] arr = new long[n];
        arr[n-1] = shifts[n-1];
        for(int i = n-2;i>=0;i--){
            arr[i] = shifts[i] + arr[i+1];
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            int pos = (int) s.charAt(i) - 97;
            char ch = (char) (((pos + arr[i]) % 26) + 97);

            sb.append(ch);
        }

        return sb.toString();
    }
}