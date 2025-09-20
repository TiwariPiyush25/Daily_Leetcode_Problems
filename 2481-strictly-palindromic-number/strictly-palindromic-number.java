class Solution {
    public boolean ispalidromic(int n,int base){
        StringBuilder sb=new StringBuilder();

        while(n>base){
            char rem=(char) (n%base);
            sb.append(rem);
            n/=base;
        }
        sb.append((char)(n));

        sb.reverse();
        
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)) return false;

            i++;
            j--;
        }

        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
        int st=2;
        int end=n-2;

        while(st<=end){
            if(!ispalidromic(n,st)) return false;

            st++;
        }

        return true;
    }
}