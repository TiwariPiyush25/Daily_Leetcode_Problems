class Solution {
    public int xorOperation(int n, int start) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=start + i * 2;
        }

        int ele=arr[0];
        for(int i=1;i<n;i++){
            ele = ele ^ arr[i];
        }

        return ele;
    }
}