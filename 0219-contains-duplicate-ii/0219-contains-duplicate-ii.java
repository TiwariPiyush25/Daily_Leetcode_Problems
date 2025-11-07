class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]) && Math.abs(i-map.get(arr[i]))<=k) return true;

            map.put(arr[i],i); 
        }

        return false;
    }
}