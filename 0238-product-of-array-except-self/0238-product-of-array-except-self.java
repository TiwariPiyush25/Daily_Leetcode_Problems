class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int[] pro=new int[n];

        pro[0]=1;
        for (int i=1;i<n;i++){
            pro[i]=pro[i-1]*arr[i-1];
        }

        int suff=1;
        for (int i=n-2;i>=0;i--){
            suff = suff * arr[i+1];
            pro[i]*=suff;
        }

        return pro;
    }
}