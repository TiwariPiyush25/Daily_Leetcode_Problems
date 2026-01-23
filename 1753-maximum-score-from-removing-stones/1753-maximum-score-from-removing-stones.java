class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        maxheap.add(a);
        maxheap.add(b);
        maxheap.add(c);

        int totalPiles = a + b + c;
        int Score = 0;
        while(totalPiles >= 2){
            int p1 = maxheap.remove();
            int p2 = maxheap.remove();
            if(p1==0 || p2 == 0) break;

            Score += 1;

            maxheap.add(p1-1);
            maxheap.add(p2-1);

            totalPiles -= 2;
        }

        return Score;
    }
}