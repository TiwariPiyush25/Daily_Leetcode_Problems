class Solution {
    public HashMap<Integer,Integer> dp = new HashMap<>();
    public int getPower(int x){
        if(x == 1) return 0;

        if(dp.containsKey(x)) return dp.get(x);

        int even = 0, odd = 0;
        if(x % 2 == 0){
            even = 1 + getPower(x/2);
        }
        if(x % 2 != 0){
            odd = 1 + getPower((3 * x) + 1);
        }

        int ans = even + odd;
        dp.put(x , ans);
        return ans;
    }
    public int getKth(int lo, int hi, int k) {
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a,b) -> (a[1] == b[1]) ? b[0] - a[0] : b[1] - a[1]);
        for(int i = lo;i <= hi;i++){
            int pow = getPower(i);
            maxheap.add(new int[]{i,pow});

            if(maxheap.size() > k) maxheap.remove();
        }

        return maxheap.peek()[0];
    }
}