class Solution {
    public int minDeletion(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }

        int[] arr = new int[map.size()];
        int i= 0;
        for(var key:map.keySet()){
            arr[i++] = map.get(key);
        }

        Arrays.sort(arr);
        int total = 0;
        for(i=0;i<arr.length - k;i++){ 
            total += arr[i];
        }

        return total;
    }
}