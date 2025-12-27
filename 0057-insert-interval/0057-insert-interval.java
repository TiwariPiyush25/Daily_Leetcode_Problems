class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> temp = new ArrayList<>();
        int i = 0;
        while(i<intervals.length){
            temp.add(intervals[i]);
            i++;
        }
        temp.add(newInterval);
        
        Collections.sort(temp,(a,b) -> a[0] - b[0]);

        List<int[]> mergedtemp = new ArrayList<>();
        for(int[] arr:temp){
            if(mergedtemp.size() ==0 || mergedtemp.get(mergedtemp.size()-1)[1] < arr[0]){
                mergedtemp.add(arr);
            }
            else{
                int[] merge = new int[2];
                merge[0] = mergedtemp.get(mergedtemp.size()-1)[0];
                merge[1] = Math.max(mergedtemp.get(mergedtemp.size()-1)[1],arr[1]);

                mergedtemp.set(mergedtemp.size()-1,merge);
            }
        }

        int[][] ans = new int[mergedtemp.size()][2];
        i=0;
        for(int[] a:mergedtemp){
            ans[i][0] = a[0];
            ans[i][1] = a[1];
            i++; 
        }

        return ans;
    }
}