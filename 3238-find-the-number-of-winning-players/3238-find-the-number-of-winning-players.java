class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        HashMap<Integer,int[]> map = new HashMap<>();

        for(int[] p : pick){
            int x = p[0] , y = p[1];

            if(!map.containsKey(x)) map.put(x,new int[11]);

            map.get(x)[y]++;
        }


        int player = 0;
        for(int key : map.keySet()){
            System.out.println(key +" "+Arrays.toString(map.get(key)));
            for(int ele : map.get(key)){
                if(ele > key) {
                    player++;
                    break;
                }
            }
        }

        return player;
    }
}