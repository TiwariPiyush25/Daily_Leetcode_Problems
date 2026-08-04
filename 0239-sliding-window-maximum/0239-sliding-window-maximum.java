class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        Deque<Integer> ad =new ArrayDeque<>();
        int[] ans = new int[n-k+1];
        for(int i = 0;i < k;i++){
            // remove smaller elements from right hand side
            while(!ad.isEmpty() && nums[ad.peekLast()] < nums[i]){
                ad.removeLast();
            }

            ad.add(i);
        }
        
        int j = 0;
        ans[j++] = nums[ad.peek()];
        for(int i = k;i < n;i++){
            int curr = nums[i];

            // remove , out of window element
            if(ad.peek() == i - k) ad.remove();

            // remove, smaller elements from right hand side
            while(!ad.isEmpty() && nums[ad.peekLast()] < nums[i]){ 
                ad.removeLast();
            }
            ad.add(i);

            ans[j++] = nums[ad.peek()];
        }

        return ans;
    }
}