class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k){
        int sum = 0;

        for(int i = 0;i < nums.size();i++){
            int cnt = 0;
            for(int j = 0;j < 32;j++){
                int mask = 1 << j;

                if((i & mask) != 0) cnt++;
            }

            if(cnt == k) sum += nums.get(i);
        }

        return sum;
    }
}