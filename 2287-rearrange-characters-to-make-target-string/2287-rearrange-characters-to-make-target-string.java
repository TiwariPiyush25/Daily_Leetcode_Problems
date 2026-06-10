class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            map1.put(s.charAt(i) , map1.getOrDefault(s.charAt(i),0)+1);
        }

        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i < target.length();i++){
            map2.put(target.charAt(i) , map2.getOrDefault(target.charAt(i),0)+1);
        }

        int min = Integer.MAX_VALUE;
        for(char key : map2.keySet()){
            if(!map1.containsKey(key)) return 0;
            min = Math.min(min , map1.get(key) / map2.get(key));
        }

        return min;
    }
}