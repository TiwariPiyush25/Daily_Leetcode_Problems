class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0; 
        for(int i = low;i <= high;i++){
            String s = "" + i;
            if(s.length() % 2 != 0) continue;
            int sum1 = 0;
            int sum2 = 0;
            for(int j = 0;j < s.length();j++){
                if(j < (s.length() / 2)) sum1 += (int) s.charAt(j) - '0';
                else sum2 += (int) s.charAt(j) - '0';
            }

            if(sum1 == sum2) cnt++;
        }

        return cnt;
    }
}