class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int v:nums){
            int f = map.getOrDefault(v,0)+1;
            if(f > 2) return false;
            map.put(v,f);
        }

        return true;
    }
}