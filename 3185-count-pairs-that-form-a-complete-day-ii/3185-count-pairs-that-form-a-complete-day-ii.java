class Solution {
    public long countCompleteDayPairs(int[] hours) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = hours.length;
        long counter = 0;
        for(int i = n - 1;i >= 0;i--){
            int hr = hours[i] % 24;

            int rem = 24 - hr;
            if(map.containsKey(rem)){
                counter += map.get(rem);
            }
            else if(hr == 0 && map.containsKey(0)){
                counter += map.get(0);
            }

            map.put(hr,map.getOrDefault(hr,0)+1);
        }

        return counter;
    }
}