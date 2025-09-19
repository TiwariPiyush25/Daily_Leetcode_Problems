class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for (int i:stones) p.add(i);

        while (p.size()>1){
            int y=p.remove();
            int x=p.remove();

            if (y!=x) p.add(y-x);
        }

        if (p.size()==0) return 0;
        return p.peek();
    }
}