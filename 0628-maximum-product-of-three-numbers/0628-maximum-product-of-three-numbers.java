class Solution {
    public int maximumProduct(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;

        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;

            while(j<k){
                int product=arr[i]*arr[j]*arr[k];
                
                maxProduct=Math.max(product,maxProduct);

                if(Math.abs(arr[j])>Math.abs(arr[k])) k--;
                else j++;
            }
        }

        return maxProduct;
    }
}