class Solution {
    public void print(int[] arr,List<List<Integer>> ans,List<Integer> perm,List<Integer> visitedindex){
        int n = arr.length , m = perm.size();
        if(n == m){
            if(!ans.contains(perm)) ans.add(new ArrayList<>(perm));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(visitedindex.contains(i)) continue; // if we already visit the element 

            // add element in perm list and its index in visitedindex list
            perm.add(arr[i]);
            visitedindex.add(i);

            print(arr,ans,perm,visitedindex);

            // backtracking
            perm.remove(perm.size()-1);
            visitedindex.remove(visitedindex.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        print(nums,ans,new ArrayList<>(),new ArrayList<>());

        return ans;
    }
}