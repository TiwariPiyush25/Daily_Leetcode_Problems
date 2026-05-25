class Solution {
    public int score(char c){
        if(c >= 'a' && c <= 'z') return 1;
        if(c >= 'A' && c <= 'Z') return 2;
        if(c >= '0' && c <= '9') return 3;
        return 5;
    }
    public int passwordStrength(String password) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i < password.length(); i++){
            set.add(password.charAt(i));
        }

        int sum = 0;
        for(char c : set){
            sum += score(c);
        }

        return sum;
    }
}