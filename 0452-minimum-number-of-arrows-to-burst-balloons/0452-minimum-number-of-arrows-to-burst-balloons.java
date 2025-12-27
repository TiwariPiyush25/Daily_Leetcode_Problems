class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a, b) -> Integer.compare(a[0],b[0]));

        List<int[]> ans = new ArrayList<>();
        for (int[] interval:points){
            if (ans.size() == 0 || ans.get(ans.size()-1)[1] < interval[0]){ 
                ans.add(interval);
            }
            else{
                int[] mergedInterval = new int[2];
                mergedInterval[0] = Math.max(interval[0],ans.get(ans.size()-1)[0]);
                mergedInterval[1] = Math.min(ans.get(ans.size()-1)[1],interval[1]);

                ans.set(ans.size()-1,mergedInterval);
            }
        }

        return ans.size();
    }
}