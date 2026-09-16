class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int i = 0;i < nums.length;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],new ArrayList<>());

            map.get(nums[i]).add(i);
        }

        int counter = 0;
        for(int key : map.keySet()){
            List<Integer> arr = new ArrayList<>(map.get(key));
            if(arr.size() >= 3 ) {
                int diff = arr.get(1) - arr.get(0);
                boolean flag = true;
                for(int i = 2;i < arr.size();i++){
                    if(arr.get(i) - arr.get(i-1) != diff) {
                        flag = false;
                        break;
                    }
                }

                if(flag) counter++;
            }
        }

        return counter;
    }
}