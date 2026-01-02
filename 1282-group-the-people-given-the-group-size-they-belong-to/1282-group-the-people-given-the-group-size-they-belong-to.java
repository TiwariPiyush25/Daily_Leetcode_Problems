class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int i = 0;i<groupSizes.length;i++){
            if(!map.containsKey(groupSizes[i])){
                map.put(groupSizes[i],new ArrayList<>());
            }

            map.get(groupSizes[i]).add(i);
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(int key:map.keySet()){
            int group = map.get(key).size() / key;
            int idx = ans.size();
            for(int i=0;i<group;i++) ans.add(new ArrayList<>());

            for(int ele:map.get(key)){
                ans.get(idx).add(ele);
                if(ans.get(idx).size() == key) idx++;
            }
        }

        return ans;
    }
}