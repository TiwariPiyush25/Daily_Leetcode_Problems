class Solution {
    public int Maximum(int[] arr){
        int max=Integer.MIN_VALUE;

        for(int i:arr){
            max=Math.max(max,i);
        }

        return max;
    }
    public int Minimum(int[] arr){
        int min=Integer.MAX_VALUE;

        for(int i:arr){
            min=Math.min(min,i);
        }

        return min;
    }
    public long maxTotalValue(int[] arr, int k) {
        int max=Maximum(arr);
        int min=Minimum(arr);

        int sum=max-min;
        long total=0;
        while(k-->0){
            total+=sum;
        }

        return total;
    }
}