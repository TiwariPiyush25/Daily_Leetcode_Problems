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
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length , n=grid[0].length;
        int[] temp=new int[m*n];
        int t=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp[t++]=grid[i][j];
            }
        }
        rotate(temp,k);

        List<List<Integer>> ans=new ArrayList<>();
        t=0;
        for(int i=0;i<m;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(temp[t++]);
            }
            ans.add(row);
        }

        return ans;
    }
}