class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int ele:arr){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }
            else map.put(ele,1);
        }

        int max=-1;
        for(int key: map.keySet()){
            if(map.get(key)==key) max=Math.max(max,key);
        }

        return max;
    }
}