class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for (int ele:arr){
            p.add(ele);
            if (p.size()>k) p.remove();
        }

        return p.peek();
    }
}