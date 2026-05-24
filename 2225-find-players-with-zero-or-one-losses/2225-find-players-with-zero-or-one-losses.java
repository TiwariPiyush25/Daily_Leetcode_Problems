class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
     //         player  loss Cnt
        HashMap<Integer,int[]> map = new HashMap<>();
        
        for(int[] match : matches){
            int winner = match[0];
            int loser = match[1];
            if(map.containsKey(winner)){
                map.get(winner)[0]++;
            }
            else {
                map.put(winner,new int[]{1,0});
            }

            if(map.containsKey(loser)){
                map.get(loser)[1]++;
            }
            else {
                map.put(loser,new int[]{0,1});
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<2;i++) ans.add(new ArrayList<>());

        for(int key : map.keySet()){
            if(map.get(key)[1] == 0){
                ans.get(0).add(key);
            }
            else if(map.get(key)[1] == 1){
                ans.get(1).add(key);
            }
        }

        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));
        return ans;
    }
}