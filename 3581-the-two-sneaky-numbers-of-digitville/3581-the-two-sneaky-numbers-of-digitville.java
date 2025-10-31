class Solution {
    public int[] getSneakyNumbers(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:arr){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }
            else map.put(ele,1);
        }
        int i=0;
        int[] ans=new int[2];
        for(var key:map.keySet()){
            if(map.get(key)==2) ans[i++]=key;
        }

        return ans;
    }
}