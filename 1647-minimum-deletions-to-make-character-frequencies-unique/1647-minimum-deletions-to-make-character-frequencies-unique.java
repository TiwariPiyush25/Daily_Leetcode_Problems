class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();
        int deletion = 0;

        for(char key : map.keySet()){
            int f = map.get(key);

            while(set.contains(f)){
                f--;
                deletion++;
            }

            set.add(f);
        }

        return deletion;
    }
}