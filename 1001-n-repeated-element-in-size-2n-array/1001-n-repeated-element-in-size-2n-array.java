class Solution {
    public int repeatedNTimes(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int ele:arr){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }
            else map.put(ele,1);
        }

        int maxfre=Integer.MIN_VALUE;
        int element=-1;

        for(int key: map.keySet()){
            if(map.get(key)>maxfre){
                maxfre=map.get(key);
                element=key;
            }
        }

        return element;
    }
}