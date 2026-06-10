class Solution {
    public boolean canFormed(HashMap<Character,Integer> map1,HashMap<Character,Integer> map2){
        for(char key : map2.keySet()){
            if(!map1.containsKey(key) || map1.get(key) < map2.get(key)) return false;
        }

        return true;
    }
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0;i < chars.length();i++){
            map.put(chars.charAt(i) , map.getOrDefault(chars.charAt(i),0)+1);
        }

        int ans = 0;
        for(String word:words){
            HashMap<Character,Integer> map1 = new HashMap<>();
            for(int i = 0;i < word.length();i++){
                map1.put(word.charAt(i) , map1.getOrDefault(word.charAt(i),0)+1);
            }

            if(canFormed(map , map1)) ans += word.length();
        }

        return ans;
    }
}