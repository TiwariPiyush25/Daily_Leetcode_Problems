class Solution {
    public boolean threeFibonacciSum(int n) {
        int a = 0,b = 1 ,c = 1;

        while(c < n){
            int sum = b + c;
            
            if(sum + a == n) return true;
            a = b;
            b = c;
            c = sum;
        }
        return false;
    }
}