class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int m = landStartTime.length, n = waterStartTime.length;

        int min = Integer.MAX_VALUE;
        for(int i = 0;i < m;i++){
            int[] Land = new int[]{landStartTime[i],landDuration[i]};
            for(int j = 0;j < n;j++){
                int[] Water = new int[]{waterStartTime[j],waterDuration[j]};

                if(Land[0] < Water[0]){
                    int x = Land[0] + Land[1];
                    if(Water[0] < x){
                        min = Math.min(min , x + Water[1]);
                    }
                    else {
                        min = Math.min (min , Water[0] + Water[1]);
                    }
                }
                else {
                    int x = Water[0] + Water[1];
                    if(Land[0] < x){
                        min = Math.min(min , x + Land[1]);
                    }
                    else {
                        min = Math.min (min , Land[0] + Land[1]);
                    }
                }
            }
        }

        return min;
    }
}