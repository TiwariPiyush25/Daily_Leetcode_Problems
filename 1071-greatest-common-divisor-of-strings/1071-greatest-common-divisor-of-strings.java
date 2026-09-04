class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int l1 = str1.length(), l2 = str2.length();
        int min = Math.min(l1 , l2);


        for(int i = min;i > 0;i--){
            if(l1 % i == 0 && l2 % i == 0){
                int t1 = l1 / i;
                int t2 = l2 / i;

                String x = str1.substring(0,i);

                String r1 = "";
                String r2 = "";

                for(int j = 0;j < t1;j++){
                    r1 += x;
                }

                for(int j = 0;j < t2;j++){
                    r2 += x;
                }

                if(r1.equals(str1) && r2.equals(str2)) return x;
            }
        }

        return "";
    }
}