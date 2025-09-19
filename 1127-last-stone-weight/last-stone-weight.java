class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i:stones) arr.add(i);

        while (arr.size()>1){
            Collections.sort(arr);
            int y=arr.removeLast();
            int x=arr.removeLast();

            if (y!=x) arr.add(y-x);
        }

        if (arr.size()==0) return 0;
        return arr.get(0);
    }
}