class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i < time.length;i++){
            time[i] = time[i] % 60;
        } 

        int pairs = 0;
        for(int i = time.length - 1;i >= 0;i--){
            int rem = 60 - time[i];

            if(map.containsKey(rem)){
                pairs += map.get(rem);
            }
            else if(time[i] == 0 && map.containsKey(0)){
                pairs += map.get(0);
            }
            map.put(time[i] , map.getOrDefault(time[i] , 0) + 1);
        }

        return pairs;
    }
}