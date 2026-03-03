class Solution {
    public String RevInvert(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0') sb.append('1');
            else sb.append('0');
        }
        return sb.reverse().toString();
    }
    public String NthString(String s,int n){
        if(n==0) return s;

        String res = s + "1" + RevInvert(s);
        String ans = NthString(res,n-1);

        return ans;
    }
    public char findKthBit(int n, int k) {
        if(n==1) return '0';
        String s = NthString("0",n);
        return s.charAt(k-1);
    }
}