class pair implements Comparable<pair> {
    int val;
    int fre;

    pair(int val,int fre){
        this.val=val;
        this.fre=fre;
    }

    public int compareTo(pair p){
        if(this.fre==p.fre) return p.val-this.val;

        return this.fre-p.fre;
    }
}
class Solution {
    public int[] frequencySort(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<pair> pq = new PriorityQueue<>();

        for(int ele:arr){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }
            else map.put(ele,1);
        }

        for(int key:map.keySet()){
            pq.add(new pair(key,map.get(key)));
        }

        int i=0;
        while(!pq.isEmpty()){
            pair p=pq.remove();
            int val=p.val;
            int fre=p.fre;

            while(fre-->0){
                arr[i++]=val;
            }
        }

        return arr;
    }
}