class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++){
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }

        int count = 0;
        for(var key : map2.keySet()){
            if(map1.containsKey(key)){
                if(map2.get(key) == map1.get(key)) continue;
                count += Math.abs(map2.get(key) - map1.get(key));
                map1.remove(key);
            }
            else count += map2.get(key);
        }

        for(var key : map1.keySet()){
            if(map2.containsKey(key)){
                if(map2.get(key) == map1.get(key)) continue;
                count += Math.abs(map2.get(key) - map1.get(key));
            }
            else count += map1.get(key);
        }

        return count;
    }
}