class Solution {
    public int score(char c){
        if(c >= 'a' && c <= 'z') return 1;
        if(c >= 'A' && c <= 'Z') return 2;
        if(c >= '0' && c <= '9') return 3;
        return 5;
    }
    public int passwordStrength(String password) {
        String distinct = "";

        for(int i = 0;i < password.length(); i++){
            if(distinct.indexOf(password.charAt(i)) == -1){
                distinct += password.charAt(i);
            }
        }

        int sum = 0;
        for(int i = 0;i < distinct.length(); i++){
            sum += score(distinct.charAt(i));
        }

        return sum;
    }
}