class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int i = 0;i < arr.length;i++){
            map1.put(target[i] , map1.getOrDefault(target[i] , 0) + 1);
            map2.put(arr[i] , map2.getOrDefault(arr[i] , 0) + 1);
        }

        return map1.equals(map2);
    }
}