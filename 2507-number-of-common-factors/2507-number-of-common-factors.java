class Solution {
    public int commonFactors(int a, int b) {
        if(b>a){
            int temp=a;
            a=b;
            b=temp;
        }

        int count=0;
        for(int i=1;i<=b;i++){
            if(a%i==0 && b%i==0) count++;
        }

        return count;
    }
}