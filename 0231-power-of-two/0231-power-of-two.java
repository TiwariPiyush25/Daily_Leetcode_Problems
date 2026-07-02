class Solution {
    public boolean isPowerOfTwo(int n) {
        int st=0;
        int end=(n/2)+1;
        
        if(n==1) return true;
        if(n%2!=0) return false;
        while(st<=end){
            int mid=(st+end)/2;

            if((int)Math.pow(2,mid)==n){
                return true;
            }
            else if((int)Math.pow(2,mid)>n){
                end=mid-1;
                }
            else{
                st=mid+1;
            }
        }
        return false;
    }
}