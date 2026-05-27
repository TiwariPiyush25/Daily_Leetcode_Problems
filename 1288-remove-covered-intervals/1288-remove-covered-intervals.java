class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals , (a , b) -> (a[0] == b[0]) ? b[1] - a[1] : a[0] - b[0]);

        List<int[]> temp = new ArrayList<>();
        temp.add(intervals[0]);

        for(int i = 1;i < intervals.length ; i++){
            int c = intervals[i][0] , d = intervals[i][1];
            int a = temp.get(temp.size()-1)[0], b = temp.get(temp.size()-1)[1];

            if(a <= c && d <= b){
                continue;
            }
            else {
                temp.add(intervals[i]);
            }
        }   

        return temp.size();
    }
}