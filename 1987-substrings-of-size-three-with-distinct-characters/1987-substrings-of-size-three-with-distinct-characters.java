class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        int st = 0;
        int end = 0;
        int count = 0;
        while(end<s.length()){
            map.put(s.charAt(end),end);

            int len = end - st + 1;
            if(len==3){
                if(map.size()==3) count++;
                if(map.get(s.charAt(st)) == st) map.remove(s.charAt(st));
                st++;
            }

            end++;
        }

        return count;
    }
}