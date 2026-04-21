class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }

        int ps = 0; int pe = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            pe = Math.max(pe,map.get(ch));

            if(i == pe){
                list.add(pe - ps + 1);
                ps = i + 1;
            }
        }
        return list;
    }
}