class Solution {
    public int alternateDigitSum(int n) {
        int count=0;
        int copy=n;
        while(copy>0){
            copy/=10;
            count++;
        }
        int sum=0;

        while(n>0){
            int ld=n%10;

            if(count%2==0){
                sum-=ld;
            }
            else{
                sum+=ld;
            }

            count--;
            n/=10;
        }

        return sum;
    }
}