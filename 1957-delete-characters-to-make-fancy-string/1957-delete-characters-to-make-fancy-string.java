class Solution {
    public String makeFancyString(String s) {
        int cnt = 0;

        StringBuilder fancy = new StringBuilder();
        
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(cnt < 2 && (i == 0 || fancy.charAt(fancy.length()-1) == ch)){
                cnt++;
                fancy.append(ch);
            }
            else if(fancy.charAt(fancy.length()-1) != ch){
                fancy.append(ch);
                cnt = 1;
            }
        }

        return fancy.toString();
    }
}