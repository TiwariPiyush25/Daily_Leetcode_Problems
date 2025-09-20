class Solution {
    public int reverse(int x) {
        if(x<(int)(-1* Math.pow(2,31)) || x>(int)(Math.pow(2,31)-1)) return 0;
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
        if(rev<(long)(-1* Math.pow(2,31)) || rev>(long)(Math.pow(2,31)-1)) return 0;
        return (int) rev;
    }
}