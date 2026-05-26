class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i = 0;i < word.length();i++) {
            char ch = word.charAt(i);

            if(ch >= 'A' && ch <= 'Z' && !map1.containsKey(ch)) map1.put(ch,i);
            else if(ch >= 'a' && ch <= 'z') map2.put(ch,i);
        }
        int count = 0;
        for(char key : map1.keySet()){
            char target = (char)((int) key + 32);
            if(map2.containsKey(target) && map2.get(target) < map1.get(key)) count++; 
        }

        return count;
    }
}