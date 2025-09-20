class Solution {
    public int reverse(int x) {
        Boolean flag=true;

        if(x<0){
            flag=false;
            x*=-1;
        }

        long rev=0;
        while(x>0){
            rev = rev*10 + (x%10);
            x/=10;
        }
        if(flag==false) rev=rev*(-1);
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
        return (int) rev;
    }
}