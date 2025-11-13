class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<Integer>> map = new HashMap<>();
        
        int n=strs.length;
        for(int i=0;i<n;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            
            String s = "";
            for(char c:arr) s+=c;

            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }

            map.get(s).add(i);
        }

        List<List<String>> ans = new ArrayList<>();
        for(List<Integer> lst : map.values()){
            List<String> temp = new ArrayList<>();
            for(int s:lst){
                temp.add(strs[s]);
            }

            ans.add(temp);
        }

        return ans;
    }
}