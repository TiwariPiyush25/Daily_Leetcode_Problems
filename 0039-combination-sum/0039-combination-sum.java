class Solution {
    public void Combination(int[] arr,int target,int sum,List<List<Integer>> ans,List<Integer> lst){
        if(sum == target){
            ArrayList<Integer> copy=new ArrayList<>();
            for (int j=0;j<lst.size();j++){
                copy.add(lst.get(j));
            }

            Collections.sort(copy);
            if(!ans.contains(copy)) ans.add(copy);
            return;
        }
        if(sum>target) return;


        for(int i=0;i<arr.length;i++){
            lst.add(arr[i]);
            Combination(arr,target,sum+arr[i],ans,lst);
            lst.remove(lst.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Combination(candidates,target,0,ans,new ArrayList<>());

        return ans;
    }
}