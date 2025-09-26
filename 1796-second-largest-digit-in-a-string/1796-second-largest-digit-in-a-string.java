class Solution {
    public int secondHighest(String s) {
        int max=-1;
        int s_max=-1;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch>='0' && ch<='9'){
                int val=ch-'0';
                if(val>max) {
                    s_max=max;
                    max=val;
                }
                else if(val!=max && val>s_max){
                    s_max=val;
                }
            }
        }

        return s_max;
    }
}