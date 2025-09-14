class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else mp.put(arr[i],1);
        }
        HashSet<Integer> hs=new HashSet<>();
        for (int key:mp.keySet()){
            hs.add(mp.get(key));
        }

        return (hs.size()==mp.size()) ? true : false;
    }
}