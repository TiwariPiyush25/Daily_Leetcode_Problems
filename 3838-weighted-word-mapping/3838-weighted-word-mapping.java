class Solution {
    public String mapWordWeights(String[] words, int[] arr) {
        String ans = "";
        
        for(String s:words){
            int sum = 0;
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                int idx = (int)(ch - 'a');
                sum += arr[idx];
            }

            int idx = sum % 26;
            int newidx = 26 - idx;
            ans += (char)(newidx + 96);
        }

        return ans;
    }
}