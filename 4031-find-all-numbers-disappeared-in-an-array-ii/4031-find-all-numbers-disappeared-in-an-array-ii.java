class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }

        int i = lower;
        while(set.contains(i)) i++;

        int st = i;
        int end = i;
        
        List<List<Integer>> ans = new ArrayList<>();
        while(i <= upper){
            if(!set.contains(i)){
                end = i;
            }
            else {
                if(set.contains(end)) continue;

                List<Integer> temp = new ArrayList<>();
                temp.add(st); temp.add(end);
                ans.add(temp);

                while(set.contains(i)) i++;
                i--;

                st = i + 1;
                end = i + 1;
            }
            i++;
        }
        if(!set.contains(upper)){
            List<Integer> temp = new ArrayList<>();
            temp.add(st); temp.add(upper);
            ans.add(temp);
        }

        return ans;
    }
}