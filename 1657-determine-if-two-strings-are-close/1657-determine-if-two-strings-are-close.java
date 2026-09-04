class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i = 0;i < word1.length();i++){
            char ch = word1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch,0) + 1);
        }

        for(int i = 0;i < word2.length();i++){
            char ch = word2.charAt(i);
            map2.put(ch , map2.getOrDefault(ch,0) + 1);

            if(!map1.containsKey(ch)) return false;
        }

        if(map1.keySet() == map2.keySet()) return true;

        ArrayList<Integer> a = new ArrayList<>(); 
        ArrayList<Integer> b = new ArrayList<>(); 
        for(var key:map1.keySet()){
            a.add(map1.get(key));
        }
        for(var key:map2.keySet()){
            b.add(map2.get(key));
        }
        Collections.sort(a);
        Collections.sort(b);

        return a.equals(b);
    }
}