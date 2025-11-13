class Solution {
    public void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int[] findErrorNums(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i]==i+1 || arr[i]==arr[arr[i]-1] || arr[i]>n) i++;
            else swap(i,arr[i]-1,arr);
        }

        
        int[] ans=new int[2];
        for(i=0;i<n;i++){
            if(arr[i]!=i+1) {
                ans[0]=arr[i];
                ans[1]=i+1;

                return ans;
            }
        }

        return ans;
    }
}