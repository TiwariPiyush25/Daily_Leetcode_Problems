class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k){
            String res = "";
            int sum = 0 , cnt = 0, i = 0;
            while(i < s.length()){
                sum += (int)(s.charAt(i)-'0');
                cnt++;

                if(cnt == k){
                    res += sum;
                    cnt = sum = 0;
                }
                i++;
            }

            if(cnt != 0) res += sum;
            s = res;
        }

        return s;
    }
}