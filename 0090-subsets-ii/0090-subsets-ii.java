class Solution {
    List<List<Integer>> ans;
    public void helper(int[] arr, List<Integer> temp,int i){
        if (i==arr.length){
            ArrayList<Integer> copy=new ArrayList<>();
            for (int j=0;j<temp.size();j++){
                copy.add(temp.get(j));
            }
            Collections.sort(copy);
            if(!ans.contains(copy)) ans.add(copy);
            return;
        }

        helper(arr,temp,i+1);
        temp.add(arr[i]);
        helper(arr,temp,i+1);
        temp.removeLast();
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(nums,temp,0);

        return ans;
    }
}