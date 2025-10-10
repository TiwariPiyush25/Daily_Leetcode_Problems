class Solution {
    public int numJewelsInStones(String j, String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else map.put(ch,1);
        }
        int count=0;
        for(int i=0;i<j.length();i++){
            char ch=j.charAt(i);
            if(map.containsKey(ch)){
                count+=map.get(ch);
            }
        }

        return count;
    }
}