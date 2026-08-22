class Solution {
    public int myAtoi(String s) {
        if(s.length() == 0) return 0;
        int i = 0 , n = s.length();
        if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') return 0;

        // remove leading white space
        while(i < n && s.charAt(i) == ' '){
            i++;
        }

        if(i >= n || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) return 0;
        // remove signedness
        boolean flag = true;
        if(s.charAt(i) == '-'){
            flag = false;
            i++;
        }
        else if(s.charAt(i) == '+'){
            i++;
        }

        if(i >= n || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || s.charAt(i) == '-' || s.charAt(i) == '+') return 0;
       
        StringBuilder res = new StringBuilder();
        while(i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            res.append(s.charAt(i));
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