class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> set = new HashSet<>();
        char c = '1';
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            
            char t1 = (char) ((int) ch - 32);
            char t2 = (char) ((int) ch + 32);
            if((t1>='A' && t1<='Z'  && set.contains(t1)) || (t2>='a' && t2<='z'  && set.contains(t2))){
                if(ch >= 'a' && ch <='z' && (int) t1 > (int) c) c = t1;
                else if(ch>='A' && ch<='Z' && (int) ch > (int) c) c = ch;  
            }
            else set.add(ch);
        }

        
        return c == '1' ? "" : "" + c;
    }
}