class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        

        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        for(int i = 0;i < n;i++){
            String s1 = "";
            String s2 = "";
            for(int j = 0;j < n;j++){
                s1 += grid[i][j] + " ";
            }
            map1.put(s1,map1.getOrDefault(s1,0)+1);

            for(int j = 0;j < n;j++){
                s2 += grid[j][i] + " ";
            }
            map2.put(s2,map2.getOrDefault(s2,0)+1);
        }

        int cnt = 0;
        for(var key : map1.keySet()){
            if(map2.containsKey(key)){
                cnt += (map1.get(key) * map2.get(key));
            }
        }

        return cnt;
    }
}