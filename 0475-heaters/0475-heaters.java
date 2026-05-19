class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int n = houses.length;
        int m = heaters.length;
        int[] mindist = new int[n];
        Arrays.fill(mindist,Integer.MAX_VALUE);
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                mindist[i] = Math.min(mindist[i],Math.abs(houses[i] - heaters[j]));
            }
        } 

        int max = Integer.MIN_VALUE;
        for(int ele:mindist){
            max = Math.max(ele,max);
        }

        return max;
    }
}