class Solution {
    public int distributeCandies(int[] arr) {
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }

        if(set.size()>=n/2) return n/2;
        return set.size();
    }
}