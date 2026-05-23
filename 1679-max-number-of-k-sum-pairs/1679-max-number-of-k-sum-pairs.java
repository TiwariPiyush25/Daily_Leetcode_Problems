class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int opration = 0;
        for(int ele : nums){
            int rem = k - ele;

            if(map.containsKey(rem)){
                int fre = map.get(rem);
                if(fre == 1) map.remove(rem);
                else map.put(rem ,fre - 1);

                opration++;
            }
            else {
                map.put(ele , map.getOrDefault(ele , 0) + 1);
            }
        }

        return opration;
    }
}