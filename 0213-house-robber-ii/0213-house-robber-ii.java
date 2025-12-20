class Solution {
    public int amount(int[] arr,int i,int[] dp){
        if(i>=arr.length) return 0;
        if (dp[i]!=-1) return dp[i];
        int take = arr[i] + amount(arr,i+2,dp);
        int skip = amount(arr,i+1,dp);

        dp[i]=Math.max(take,skip);
        
        return dp[i];
    }
    public int rob(int[] arr) {
        if(arr.length==1) return arr[0];
        int n=arr.length;
        int[] arr1 = new int[n-1];
        int[] arr2 = new int[n-1];

        int j = 0,k=0;
        for(int i=0;i<n;i++){
            if(i<n-1) arr1[j++] = arr[i];
            if(i>0) arr2[k++] = arr[i]; 
        }
        int[] dp1=new int[n-1];
        int[] dp2=new int[n-1];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

        return Math.max(amount(arr1,0,dp1),amount(arr2,0,dp2));
    }
}