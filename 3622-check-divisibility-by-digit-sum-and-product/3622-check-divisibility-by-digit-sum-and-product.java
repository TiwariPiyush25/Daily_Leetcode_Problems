class Solution {
    public int digitSum(int n){
        int sum=0;

        while(n>0){
            int ld=n%10;
            sum+=ld;
            n=n/10;
        }

        return sum;
    }

    public int digitprod(int n){
        int prod=1;

        while(n>0){
            int ld=n%10;
            prod*=ld;
            n=n/10;
        }

        return prod;
    }
    public boolean checkDivisibility(int n) {
        int sum=digitSum(n);
        int product=digitprod(n);

        return (n%(sum+product)==0) ? true : false;
    }
}