class Solution {
    public  class pair implements Comparable<pair>{
        int noOfBoxes;
        int UnitesperBox;

        pair(int n,int u){
            this.noOfBoxes = n;
            this.UnitesperBox = u;
        }

        public int compareTo(pair p){
            return p.UnitesperBox - this.UnitesperBox;
        }
    }
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        pair[] arr = new pair[boxTypes.length];

        int i = 0;
        for (int[] a:boxTypes){
            arr[i++] = new pair(a[0],a[1]);
        }

        Arrays.sort(arr);

        int result = 0;
        for (pair p:arr){
            int n = p.noOfBoxes;
            int u = p.UnitesperBox;

            int min = Math.min(truckSize,n);
            truckSize -= min;

            result += min * u;
            if (truckSize==0){
                return result;
            }
        }

        return result;
    }
}