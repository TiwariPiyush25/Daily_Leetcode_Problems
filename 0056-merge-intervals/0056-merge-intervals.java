class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);

        List<int[]> temp_ans = new ArrayList<>();
        for (int[] interval:intervals){
            if (temp_ans.size() == 0 || temp_ans.get(temp_ans.size()-1)[1] < interval[0]){ // If List is empty or No overlapping of intervals
                temp_ans.add(interval);
            }
            else{
               int[] mergedInterval = new int[2];
               mergedInterval[0] = temp_ans.get(temp_ans.size()-1)[0];
               mergedInterval[1] = Math.max(temp_ans.get(temp_ans.size()-1)[1],interval[1]);

                temp_ans.set(temp_ans.size()-1,mergedInterval);
            }
        }

        int[][] ans = new int[temp_ans.size()][2];
        int i = 0;
        for (int[] interval: temp_ans){
            ans[i][0] = interval[0];
            ans[i][1] = interval[1];
            i++;
        }

        return ans;
    }
}