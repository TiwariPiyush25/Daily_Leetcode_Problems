class Solution {
    public boolean isVowel(char s){
        return s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u';
    }
    public class triplet implements Comparable<triplet>{
        char c;
        int fi;
        int fre;

        triplet(char c,int fi,int fre){
            this.c = c;
            this.fi = fi;
            this.fre = fre;
        }

        public int compareTo(triplet t) {
            if(t.fre == this.fre) return Integer.compare(this.fi,t.fi);
            return Integer.compare(t.fre,this.fre);
        }
    }
    public String sortVowels(String s) {
        HashMap<Character,int[]> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                if(!map.containsKey(ch)) map.put(ch ,new int[]{i,1});
                else map.get(ch)[1] += 1;
            }
        }
        if(map.size() == 0) return s;

        PriorityQueue<triplet> maxheap = new PriorityQueue<>();
        for(var key : map.keySet()){
            maxheap.add(new triplet(key,map.get(key)[0],map.get(key)[1]));
        }

        StringBuilder sb = new StringBuilder();
        int k = maxheap.peek().fre;
        for(int i=0;i<s.length();i++){
            if(k == 0) {
                maxheap.poll();
                if(!maxheap.isEmpty()) k = maxheap.peek().fre;
            }

            if(isVowel(s.charAt(i))){
                sb.append(maxheap.peek().c);
                k--;
            }
            else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}