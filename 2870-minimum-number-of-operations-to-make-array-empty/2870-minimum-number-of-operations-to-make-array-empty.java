class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ele : nums){
            map.put(ele , map.getOrDefault(ele , 0) + 1);
        }

        int operation = 0;
        for(int key : map.keySet()){
            int val = map.get(key);
            if(val == 1) return -1;

            while(val > 0){
                if(val % 3  == 0 || val % 2 != 0) {
                    val -= 3;
                }
                else {
                    val -= 2;
                }

                operation++;
            }
        }

        return operation;
    }
}