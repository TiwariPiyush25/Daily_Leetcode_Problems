class Solution {
    public int numWaterBottles(int n, int m) {
        int total=n;

        while(n>0){
            int rem=n%m;
            if(n<m) break;
            total+=n/m;

            n=(n/m)+rem;
        }

        return total;
    }
}