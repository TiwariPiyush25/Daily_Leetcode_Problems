class pair implements Comparable<pair>{
    int value;
    int count;

    pair(int v,int c){
        this.value = v;
        this.count = c;
    }

    public int compareTo(pair p){
        if(p.count == this.count) return this.value - p.value;
        return this.count - p.count;
    }
}
class Solution {
    public int count1s(int x){
        int count = 0;
        while(x>1){
            int ld = x % 2;
            if(ld==1) count++;
            x/=2;
        }

        if(x==1) {
            count++;
        }
        return count;
    }
    public int[] sortByBits(int[] arr) {
        PriorityQueue<pair> heap = new PriorityQueue<>();

        for(int ele:arr){
            heap.add(new pair(ele,count1s(ele)));
        }

        int i=0;
        while(!heap.isEmpty()){
            pair p = heap.remove();
            arr[i++] = p.value;
        }

        return arr;
    }
}