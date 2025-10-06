class Solution {
    public int arrangeCoins(int n) {
        long st=1;
        long end=n;

        long ans=-1;

        while(st<=end){
            long mid=st+((end-st)/2);

            long total=(mid*(mid+1))/2;
            if(total<=n){
                ans=mid;
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return (int)ans;
    }
}