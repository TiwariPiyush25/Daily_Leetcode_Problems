class Solution {
    public int myAtoi(String s) {
        if(s.length() == 0) return 0;
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(0) >= 'a' && sb.charAt(0) <= 'z') return 0;

        // remove leading white space
        while(sb.length() > 0 && sb.charAt(0) == ' '){
            sb.deleteCharAt(0);
        }

        if(sb.length() == 0 || (sb.charAt(0) >= 'a' && sb.charAt(0) <= 'z')) return 0;
        // remove signedness
        boolean flag = true;
        if(sb.charAt(0) == '-'){
            flag = false;
            sb.deleteCharAt(0);
        }
        else if(sb.charAt(0) == '+'){
            sb.deleteCharAt(0);
        }

        if(sb.length() == 0 || (sb.charAt(0) >= 'a' && sb.charAt(0) <= 'z') || sb.charAt(0) == '-' || sb.charAt(0) == '+') return 0;
       
        int i = 0;
        StringBuilder res = new StringBuilder();
        while(i < sb.length() && sb.charAt(i) >= '0' && sb.charAt(i) <= '9'){
            res.append(sb.charAt(i));
            i++;
        }
        
        long val = 0;
        for(int k = 0;k < res.length();k++){
            int v = (int) (res.charAt(k) - '0');
            if(flag && (val * 10 + v) > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(!flag && -(val * 10 + v) < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            
            val = val * 10 + v;
        }

        if(!flag) val = -val;
        return (int) val;
    }
}