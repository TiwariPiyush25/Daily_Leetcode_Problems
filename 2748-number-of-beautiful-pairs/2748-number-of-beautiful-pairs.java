class Solution {
    public int gcd(int x,int y){
        if(x % y == 0) return y;

        return gcd(y , x % y);
    }
    public int countBeautifulPairs(int[] nums) {
        int beutifulpairs = 0;

        for(int i = 0;i < nums.length;i++){
            for(int j = i + 1;j < nums.length;j++){
                int v1 = nums[i];
                int v2 = nums[j];

                while(v1 > 9){
                    v1 /= 10;
                }

                if(gcd(v1,v2%10) == 1) beutifulpairs++;
            }
        }

        return beutifulpairs;
    }
}