class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;

        int i=0;
        while((1<<i) <= n){
            i++;
        }

        for(int j=0;j<i;j++){
            int mask = 1<<j;
            n = n ^ mask;
        }

        return n;
    }
}