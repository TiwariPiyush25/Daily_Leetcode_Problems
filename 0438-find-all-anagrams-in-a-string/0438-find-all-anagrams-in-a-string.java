class Solution {
    public List<Integer> findAnagrams(String s, String p) { 
        List<Integer> ans = new ArrayList<>();
        if(p.length() > s.length()) return ans;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        int n = p.length();

        for(int i=0;i<n;i++){ // add till String p's frequency
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            map2.put(p.charAt(i),map2.getOrDefault(p.charAt(i),0)+1);
        }

        int st = 0;
        int end = n;
        while(end < s.length()){ // sliding window
            if(map1.entrySet().equals(map2.entrySet())) ans.add(st);

            map1.put(s.charAt(end),map1.getOrDefault(s.charAt(end),0)+1);
            
            int freq = map1.get(s.charAt(st));
            if(freq == 1) map1.remove(s.charAt(st));
            else map1.put(s.charAt(st),freq-1);

            st++;
            end++;
        }

        if(map1.entrySet().equals(map2.entrySet())) ans.add(st);

        return ans;
    }
}