class Solution {
    public double pow(double x,int n){
        if(n==0) return (double)1;

        double val = pow(x,n/2);

        if(n %2 == 0){
            return val * val;
        }
        return x * val * val;
    }
    public double myPow(double x, int n) {
        if(n>=0) return pow(x,n);

        return 1 / pow(x,Math.abs(n));
    }
}