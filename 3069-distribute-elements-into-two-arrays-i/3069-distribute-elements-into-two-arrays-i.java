class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]); arr2.add(nums[1]);
        for(int i = 2;i < nums.length;i++){
            int num1 = arr1.getLast() , num2 = arr2.getLast();

            if(num1 > num2) arr1.add(nums[i]);
            else arr2.add(nums[i]);
        }

        int j = 0;
        for(int i = 0;i < arr1.size();i++) nums[j++] = arr1.get(i);
        for(int i = 0;i < arr2.size();i++) nums[j++] = arr2.get(i);

        return nums;
    }
}