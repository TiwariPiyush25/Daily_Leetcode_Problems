class pair implements Comparable<pair> {
    int height;
    String name;

    pair(int h,String n){
        this.height=h;
        this.name=n;
    }

    public int compareTo(pair p){
        return this.height-p.height;
    }
}
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<heights.length;i++){
            pq.add(new pair(heights[i],names[i]));
        }
        
        int i=0;
        while(!pq.isEmpty()){
            pair p=pq.remove();
            names[i++]=p.name;
        }

        return names;
    }
}