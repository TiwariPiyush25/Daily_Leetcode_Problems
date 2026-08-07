class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ele : tasks){
            map.put(ele , map.getOrDefault(ele , 0) + 1);
        }

        int rounds = 0;
        for(int key : map.keySet()){
            int val = map.get(key);
            if(val < 2) return -1;

            while(val > 0){
                if(val % 3  == 0 || val % 2 != 0) {
                    val -= 3;
                }
                else {
                    val -= 2;
                }

                rounds++;
            }
        }

        return rounds;
    }
}