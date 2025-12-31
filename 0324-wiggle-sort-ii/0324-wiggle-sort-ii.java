class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = (n-1) / 2;
        int j = n-1;

        int k = 0;
        int[] ans = new int[n];
        while(j>= ((n-1)/2) && i>=0){
            ans[k] = nums[i];
            if(k!=n-1) ans[k+1] = nums[j];

            k+=2;
            i--; j--;
        }

        k = 0;
        for(int ele:ans) nums[k++] = ele;
    }
}