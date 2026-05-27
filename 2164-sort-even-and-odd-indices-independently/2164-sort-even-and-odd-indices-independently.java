class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();

        for(int i = 0;i < nums.length;i++){
            if(i % 2 == 0) A.add(nums[i]);
            else B.add(nums[i]);
        }

        Collections.sort(A);
        Collections.sort(B);
        Collections.reverse(B);
        int j = 0, k = 0;
        for(int i = 0;i < nums.length;i++){
            if(i % 2 == 0) nums[i] = A.get(j++);
            else nums[i] = B.get(k++);
        }

        return nums;
    }
}