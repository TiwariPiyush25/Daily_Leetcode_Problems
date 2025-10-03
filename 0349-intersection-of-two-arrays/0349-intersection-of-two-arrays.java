class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int ele:arr1) set1.add(ele);
        for(int ele:arr2) {
            if(set1.contains(ele)){
                set2.add(ele);
            }
        }

        int[] arr=new int[set2.size()];
        int i=0;
        for(int ele:set2){
            arr[i++]=ele;
        }

        return arr;
    }
}