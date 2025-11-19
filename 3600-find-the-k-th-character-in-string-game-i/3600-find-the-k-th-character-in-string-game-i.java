class Solution {
    public String helper(String s,int k){
        if(s.length()>=k) return s;

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            int ascii = (int)s.charAt(i);

            char ch = (char)(ascii + 1);
            sb.append(ch);
        }

        s+=sb.toString();

        String res = helper(s,k);

        return res;
    }
    public char kthCharacter(int k) {
        String s = helper("a",k);

        return s.charAt(k-1);
    }
}