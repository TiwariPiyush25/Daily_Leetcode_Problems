class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        TreeMap<String,Integer> map = new TreeMap<>();
        int max = 0;
        for(int i = 0;i < messages.length;i++){
            String s = messages[i];

            int cnt = 0;
            for(int j = 0;j < s.length();j++){
                if(s.charAt(j) == ' ') cnt++;
            }
            int words = map.getOrDefault(senders[i],0) + (cnt + 1);
            max = Math.max(max , words);
            map.put(senders[i],words);
        }
        
        String ans = "";
        for(String key : map.keySet()){
            if(map.get(key) == max){
                ans = key;
            }
        }

        return ans;
    }
}