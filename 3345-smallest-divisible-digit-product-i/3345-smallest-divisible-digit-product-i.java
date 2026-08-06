class Solution {
    public int smallestNumber(int n, int t) {
      // kyuki har 10 numbers me ek number esa hota hai jiska product zero(10,20,30,40 .. etc) hota hai or 0 har number se divisible hota hai
      for(int i = n;i <= n + 10;i++){
        int product = 1;
        int num = i;
        while(num > 0){
            product *= (num % 10);
            num /= 10;
        }
        if(product % t == 0) return i;
      }
      return 0;
    }
}