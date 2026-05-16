class Solution {
    public int maxScore(String s) {
        int n = s.length();

        int zero = 0;

        int maxScore = 0;
        for(int i = 0;i < n; i++){
            if(s.charAt(i) == '0') zero++;
            int ones = 0;
            for(int j = n-1;j > i; j--){
                if(s.charAt(j) == '1') ones++;
                maxScore = Math.max(maxScore , zero + ones);
            }
        }

        return maxScore;
    }
}