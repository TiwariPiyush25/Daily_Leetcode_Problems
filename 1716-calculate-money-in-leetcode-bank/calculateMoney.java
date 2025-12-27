class Solution {
    public int totalMoney(int n) {
        int c = 0;

        int sum  = 0;

        while(n>=7){
            int val = 7 + c;

            sum += (val*(val+1)/2) - (c*(c+1)/2);
            c++;
            n-=7;
        }

        if(n>0) sum += ((n+c)*((n+c)+1)/2) - (c*(c+1)/2);

        return sum;
    }
}
