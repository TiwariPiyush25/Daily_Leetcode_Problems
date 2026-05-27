class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy[i] = arr[i];
        }

        Arrays.sort(copy);
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            int x = copy[i];
            if(set.contains(x)) copy[i] = set.size();
            else copy[i] = set.size() + 1;

            map.put(x,copy[i]);
            set.add(x);
        }

        for(int i = 0;i < arr.length;i++){
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}