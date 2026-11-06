class Solution {
    public boolean isSorted(int[] arr,int n){
        for(int i = 1;i < n;i++){
            if(arr[i] < arr[i - 1]) return false;
        }

        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        int size = nums.length;
        int steps = 0;
        while(!isSorted(nums,size) && size > 1) {
            int f = 0 , s = 1;

            int sum = nums[0] + nums[1]; 
            for(int i = 2;i < size;i++) {
                if(nums[i] + nums[i - 1] < sum){
                    sum = nums[i] + nums[i - 1];
                    f = i - 1;
                    s = i;
                }
            }

            nums[f] = sum;
            nums[s] = Integer.MIN_VALUE;

            for(int i = 0;i < size - 1;i++){
                if(nums[i] == Integer.MIN_VALUE){
                    nums[i] = nums[i + 1];
                    nums[i + 1] = Integer.MIN_VALUE;
                }
            }

            System.out.println(Arrays.toString(nums));
            size--;
            steps++;
        }

        return steps;
    }
}