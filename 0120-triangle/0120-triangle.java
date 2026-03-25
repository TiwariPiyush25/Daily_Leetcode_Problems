class Solution {
    public int helper(int i,int j,List<List<Integer>> arr,HashMap<String,Integer> dp ){
        if(i == arr.size()){
            return 0;
        }

        String s = i+","+j;
        if(dp.containsKey(s)) return dp.get(s);
        int same = arr.get(i).get(j) + helper(i+1,j,arr,dp);
        if(arr.get(i).size() == 1) return same;

        int next = arr.get(i).get(j+1) + helper(i+1,j+1,arr,dp);
        dp.put(i+","+j,Math.min(same,next));
        return Math.min(same,next);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        HashMap<String,Integer> dp = new HashMap<>();
        return helper(0,0,triangle,dp);
    }
}