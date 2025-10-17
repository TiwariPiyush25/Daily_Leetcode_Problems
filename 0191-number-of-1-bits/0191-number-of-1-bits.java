class Solution {
    public String binary(int n){
        String s="";

        while(n>1){
            int rem=n%2;
            s = rem + s;
            n/=2; 
        }
        if(n>0) s = n +s;

        return s;
    }
    public int hammingWeight(int n) {
        String s=binary(n);

        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count++;
        }

        return count;
    }
}