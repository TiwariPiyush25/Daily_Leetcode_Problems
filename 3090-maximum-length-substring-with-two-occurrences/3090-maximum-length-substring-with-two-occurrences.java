class Solution {
    public int maximumLengthSubstring(String s) {
        int st = 0 ,end = 0 ,n = s.length(), maxlen = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(end < n){
            char ch = s.charAt(end);
            
            int f = map.getOrDefault(ch,0) + 1;
            map.put(ch , f);

            int len = end - st;
            maxlen = Math.max(maxlen , len);

            while(map.get(ch) > 2){
                int x = map.get(s.charAt(st));
                if(x == 1) map.remove(s.charAt(st));
                else map.put(s.charAt(st),x-1);

                st++;
            }

            end++;
        }

        int len = end - st;
        maxlen = Math.max(maxlen , len);

        return maxlen;
    }
}