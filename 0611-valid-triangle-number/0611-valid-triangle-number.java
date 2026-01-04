class Solution {
    public int Search(int l,int r,int target,int[] arr){
        int ans=r+1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]>=target){
                r=mid-1;
                ans=mid;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum = nums[i] + nums[j];
                int idx = Search(j+1,nums.length-1,sum,nums);
                count += (idx-j-1);
            }
        }

        return count;
    }
}