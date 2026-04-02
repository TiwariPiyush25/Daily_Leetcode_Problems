class EventManager {
    HashMap<Integer,Integer> map;
    PriorityQueue<int[]> maxheap;

    public EventManager(int[][] events) {
        map = new HashMap<>();
        maxheap = new PriorityQueue<>(((a,b) -> (a[1] != b[1]) ? b[1] - a[1] : a[0] - b[0]));

        for(int[] event:events){
            maxheap.add(new int[]{event[0],event[1]});
            map.put(event[0],event[1]);
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        map.put(eventId,newPriority);
        maxheap.add(new int[]{eventId,newPriority});
    }
    
    public int pollHighest() {
        while(!maxheap.isEmpty() && (!map.containsKey(maxheap.peek()[0]) || maxheap.peek()[1] != map.get(maxheap.peek()[0]))){
            maxheap.remove();
        }
        if(maxheap.isEmpty()) return -1;

        map.remove(maxheap.peek()[0]);
        return maxheap.remove()[0];
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */