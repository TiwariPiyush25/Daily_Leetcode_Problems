class Solution {
    public int maximumCount(int[] arr) {
        int st=0;
        int end=arr.length-1;

        int firstposidx=0;
        while(st<=end){
            int mid=(st+end)/2;

            if(arr[mid]>=0){
                firstposidx=mid;
                end=mid-1;
            }
            else st=mid+1;
        }

        int i=firstposidx;
        int zerocount=0;
        while(i<arr.length && arr[i++]==0) zerocount++;

        return Math.max(firstposidx,arr.length-firstposidx-zerocount);
    }
}