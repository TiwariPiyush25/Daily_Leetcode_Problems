class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int pairs = 0;
        for(int i = time.length - 1;i >= 0;i--){
            int val = time[i] % 60;

            int rem = 60 - val;

            if(map.containsKey(rem)){
                pairs += map.get(rem);
            }
            else if(val == 0 && map.containsKey(0)){
                pairs += map.get(0);
            }
            map.put(val , map.getOrDefault(val , 0) + 1);
        }

        return pairs;
    }
}