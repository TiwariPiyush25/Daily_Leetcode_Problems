class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int ec) {
        int max = Integer.MIN_VALUE;

        for(int ele:arr) max = Math.max(ele,max);
        
        List<Boolean> result = new ArrayList<>(); 
        for(int ele:arr){
            result.add(ele+ec >= max ? true : false);
        }

        return result;
    }
}