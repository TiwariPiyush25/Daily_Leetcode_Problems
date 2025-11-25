class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int count = 0;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        for(int ele:nums){
            if(ele==pivot) count++;
            else if(pivot > ele) arr1.add(ele);
            else arr2.add(ele);
        }

        int i = 0;
        for(int ele:arr1) nums[i++] =  ele;

        while(count-->0)  nums[i++] =  pivot;

        for(int ele:arr2) nums[i++] =  ele;

        return nums;
    }
}