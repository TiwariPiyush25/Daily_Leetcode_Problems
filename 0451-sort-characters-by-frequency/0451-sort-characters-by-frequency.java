class pair implements Comparable<pair>{
    char ch;
    int fre;

    pair(char ch,int fre){
        this.ch=ch;
        this.fre=fre;
    }

    public int compareTo(pair p){
        return this.fre-p.fre;
    }
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){ // count occurances of characters
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else map.put(ch,1);
        }

        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(var key:map.keySet()){
            pq.add(new pair(key,map.get(key)));
        }

        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            pair p=pq.remove();
            char ch=p.ch;
            int fre=p.fre;

            while(fre-->0) sb.append(ch);
        }

        return sb.toString();
    }
}