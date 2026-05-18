class Solution {
    public int nthUglyNumber(int n) {
        HashSet<Long> set = new HashSet<>();
        PriorityQueue<Long> p = new PriorityQueue<>();

        set.add(1L);
        p.add(1L);

        long first = 1;
        for(int i = 0;i < n;i++){
            if(p.size() == 0) break;
            first = p.remove();

            if(!set.contains(first * 2)) {
                p.add(first * 2);
                set.add(first * 2);
            }
            if(!set.contains(first * 3)) {
                p.add(first * 3);
                set.add(first * 3);
            }
            if(!set.contains(first * 5)) {
                p.add(first * 5);
                set.add(first * 5);
            }
        }

        return (int) first;
    }
}