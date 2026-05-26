class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> vis = new HashSet<>();
        int cnt = 0;
        for(int i = 0;i < word.length(); i++){
            char c = word.charAt(i);

            if(set.contains((char) ((int) c - 32)) || set.contains((char) ((int) c + 32))){
                if(!vis.contains(c)) cnt++;
                vis.add(c);
            }
            else set.add(c);
        }

        return cnt;
    }
}