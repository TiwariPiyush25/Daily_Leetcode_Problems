class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map = new HashMap<>();
        int max = 0;
        for(List<String> str: responses){
            HashSet<String> set = new HashSet<>();
            for(String s : str){
                if(!set.contains(s)){
                    int f = map.getOrDefault(s,0)+1;
                    max = Math.max(max,f);
                    map.put(s , f);
                }
                set.add(s);
            }
        }
        
        List<String> lst = new ArrayList<>();
        for(String key : map.keySet()){
            if(map.get(key) == max) lst.add(key);
        }

        Collections.sort(lst);
        return lst.get(0);
    }
}