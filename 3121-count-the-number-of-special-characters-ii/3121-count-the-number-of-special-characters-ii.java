class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0;i < word.length();i++) {
            char ch = word.charAt(i);

            if(ch >= 'A' && ch <= 'Z' && !map.containsKey(ch)) map.put(ch,i);
            else if(ch >= 'a' && ch <= 'z') map.put(ch,i);
        }
        int count = 0;
        for(char key : map.keySet()){
            if(key >= 'A' && key <= 'Z') {
                char target = (char)((int) key + 32);
                if(map.containsKey(target) && map.get(target) < map.get(key)) count++;
            } 
        }

        return count;
    }
}