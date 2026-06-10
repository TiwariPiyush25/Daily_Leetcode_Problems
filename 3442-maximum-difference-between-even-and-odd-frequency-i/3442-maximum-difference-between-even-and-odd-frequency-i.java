class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
        }

        int maxo=Integer.MIN_VALUE;
        int mine=Integer.MAX_VALUE;
        
        for(char key : map.keySet()){
            if(map.get(key) % 2 == 0) mine = Math.min(mine , map.get(key) );
            else maxo = Math.max(maxo , map.get(key));
        }
        System.out.println(maxo+" "+mine);

        return maxo - mine;
    }
}