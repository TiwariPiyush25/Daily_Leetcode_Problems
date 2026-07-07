class Solution {
    public long sumAndMultiply(int n) {
        String s = "" + n;

        String res = "";
        int sum = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                res+= s.charAt(i);
                sum += (int) s.charAt(i) - '0';
            }
        }
        if(sum==0) return 0;
        int val = Integer.parseInt(res);
        return (long)val * sum;
    }
}