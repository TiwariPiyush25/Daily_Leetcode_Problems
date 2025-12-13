class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = 0;
        for(int ele:nums){
            int fre = map.getOrDefault(ele,0) + 1;
            len = Math.max(len,fre);
            map.put(ele,fre);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int  i=0;i<len;i++){
            ans.add(new ArrayList<>());
        }

        for(var key : map.keySet()){
            for(int i=0;i<map.get(key);i++){
                ans.get(i).add(key);
            }
        }

        return ans;
    }
}