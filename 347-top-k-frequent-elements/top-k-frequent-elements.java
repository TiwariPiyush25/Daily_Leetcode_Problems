class Solution {
    public static class pair implements Comparable<pair>{
        int val;
        int fre;

        pair(int val,int fre){
            this.val=val;
            this.fre=fre;
        }

        public int compareTo(pair p){
            return this.fre-p.fre;
        }
    }
    public static int[] topKFrequent(int[] arr, int k) {
        int[] ans=new int[k];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i:arr){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else map.put(i,1);
        }
        

        PriorityQueue<pair> p=new PriorityQueue<>();
        for (int key:map.keySet()){

            p.add(new pair(key,map.get(key)));
            if (p.size()>k) p.remove();
        }

        int i=0;
        while (p.size()>0){
            ans[i++]=p.remove().val;
        }

        return ans;
    }
}