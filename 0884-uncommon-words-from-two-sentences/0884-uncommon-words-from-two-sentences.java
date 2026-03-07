class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        for(String s:arr1) map.put(s,map.getOrDefault(s,0)+1);
        for(String s:arr2) map.put(s,map.getOrDefault(s,0)+1);

        int cnt = 0;
        for(String key:map.keySet()) if(map.get(key) == 1) cnt++;

        String[] ans = new String[cnt];
        int i=0;

        for(String key:map.keySet()) 
            if(map.get(key) == 1) 
                ans[i++] = key;

        return ans;
    }
}