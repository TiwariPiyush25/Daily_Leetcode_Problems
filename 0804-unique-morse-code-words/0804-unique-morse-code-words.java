class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",  
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",     
            "...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> set = new HashSet<>();
        for(String s : words){
            String r = "";
            for(int i = 0;i < s.length();i++){
                int idx = s.charAt(i) - 'a';
                r += arr[idx];
            }

            set.add(r);
        }

        return set.size();
    }
}