class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,int[]> map = new HashMap<>();

        for(int i = 0;i < s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),new int[]{i,i});
            }
            else map.get(s.charAt(i))[1] = i;
        }

        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            max = Math.max(max , map.get(key)[1] - map.get(key)[0] - 1);
        }
        return max;
    }
}