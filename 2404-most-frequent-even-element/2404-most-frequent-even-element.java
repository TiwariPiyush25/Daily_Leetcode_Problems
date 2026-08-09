class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int max = 0;
        for(int ele : nums){
            if(ele % 2 == 0){
                int f = map.getOrDefault(ele , 0) + 1;
                max = Math.max(max , f);
                map.put(ele , f);
            }
        }

        List<Integer> temp = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) == max){
                temp.add(key);
            }
        }

        if(temp.size() == 0) return -1;

        Collections.sort(temp);
        return temp.get(0);
    }
}