class Solution {
    public boolean isprime(int n){
        return n==2 || n==3 || n==5 || n==7 || n==11 || n==13 || n==17 || n==19 || n==23 || n==29 || n==31;
    }
    public int countPrimeSetBits(int left, int right) {
        int Count = 0;
        while(left <= right){
            int cnt = 0;
            for(int i=0;i<32;i++){
                int mask = 1 << i;

                if((left & mask)!=0) cnt++;
            }

            if(isprime(cnt)) Count++;
            left++;
        }

        return Count;
    }
}