class Solution {
    public int numberOfMatches(int n) {
        int total=0;

        while(n>0){
            total += n/2;

            if(n/2==0) break;
            if(n%2==0) n/=2;
            else {
                n = (n/2) + 1;
            }
        }

        return total;
    }
}