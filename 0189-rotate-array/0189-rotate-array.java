class Solution {
    public static void reverse(int[] arr,int st,int end){
        int i=st;
        int j=end;

        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
    public void rotate(int[] nums, int k) {
        
        if(nums.length==1) return;
        k=k%nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);

    }
}