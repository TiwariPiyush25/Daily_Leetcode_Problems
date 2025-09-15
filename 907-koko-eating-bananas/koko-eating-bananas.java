class Solution {
    public static int max(int[] arr){
        int m=arr[0];
        for(int i:arr){
            if(i>m) m=i;
        }

        return m;
    }

    public boolean possible(int[] arr,int k,int h){
        long count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%k==0) count+=(arr[i]/k);
            else count+=(arr[i]/k) + 1;
        }

        return count<=h;
    }
    public int minEatingSpeed(int[] arr, int h) {
        int st=1;
        int end=max(arr);

        int ans=-1;
        while(st<=end){
            int mid=(st+end)/2;

            if(possible(arr,mid,h)){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }

        return ans;
    }
}