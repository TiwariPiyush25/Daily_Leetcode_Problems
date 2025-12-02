class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ele : nums){
           if(map.containsKey(ele) && map.get(ele)<2){
                arr.add(ele);
                map.put(ele,map.get(ele)+1);
           }
           else if(!map.containsKey(ele)){
                arr.add(ele);
                map.put(ele,1);
           }
        }

        int k = arr.size();
        int i = 0;
        for(int ele:arr) nums[i++] = ele;

        return k; 
    }
}