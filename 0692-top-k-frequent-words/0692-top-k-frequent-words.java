class Solution {
    public class pair implements Comparable<pair>{
        String str;
        int fre;

        pair(String s,int f){
            this.str = s;
            this.fre = f;
        }

        public int compareTo(pair p){
            if(this.fre == p.fre) return p.str.compareTo(this.str);
            return this.fre - p.fre;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();

        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        PriorityQueue<pair> p = new PriorityQueue<>();
        for(String key:map.keySet()){
            p.add(new pair(key,map.get(key)));

            if(p.size() > k) p.remove();
        }
        List<String> ans = new ArrayList<>();

        while(!p.isEmpty()) ans.add(0,p.remove().str);

        return ans;
    }
}