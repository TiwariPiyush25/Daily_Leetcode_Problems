class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n  = grid.length * grid.length;
        int  sum = (n * (n+1)) / 2;
        
        HashSet<Integer> set = new HashSet<>();
        int s = 0;
        int repetedvalue = -1;
        for(int[] arr:grid){
            for(int ele:arr){
                if(!set.contains(ele)){
                    set.add(ele);
                    s+= ele;
                }
                else repetedvalue = ele;
            }
        }

        int[] ans = new int[2];

        ans[0] = repetedvalue;
        ans[1] = sum - s;

        return ans;
    } 
}