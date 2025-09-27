class Solution {
    public int maximumProduct(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;

        int min=arr[0];
        int s_min=arr[1];

        int max=arr[n-1];
        int s_max=arr[n-2];
        int t_max=arr[n-3];

        int p1=min*s_min*max;
        int p2=max*s_max*t_max;


        return p1>p2 ? p1 : p2;
    }
}