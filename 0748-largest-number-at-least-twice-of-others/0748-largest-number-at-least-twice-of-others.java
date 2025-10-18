class Solution {
    public int dominantIndex(int[] arr) {
        int max=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            int ele=arr[i];
            if(ele>max){
                max=ele;
                idx=i;
            }
        }

        for(int ele:arr){
            if(ele!=max && ele*2>max) return -1;
        }

        return idx;
    }
}