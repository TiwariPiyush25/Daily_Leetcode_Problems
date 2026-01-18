class Solution {
    public HashMap<String,Integer> map;
    public String b;
    List<List<String>> ans;
    public void dfs(String word,List<String> lst){
        if(word.equals(b)){
            List<String> dup = new ArrayList<>(lst);
            Collections.reverse(dup);
            ans.add(dup);
            return;
        }

        int step = map.get(word);
        for(int i=0;i<word.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char[] arr = word.toCharArray();
                    arr[i] = ch;
                    String newString = new String(arr);

                    if(map.containsKey(newString) && map.get(newString) + 1 == step){
                        lst.add(newString);
                        dfs(newString,lst);
                        lst.remove(lst.size()-1);
                    }
                }
            }
    }
    public List<List<String>> findLadders(String src, String target, List<String> wordList) {
        b = src;
        map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(String s:wordList){
            set.add(s);
        } 

        Queue<String> q = new LinkedList<>();
        q.add(src);
        map.put(src,1);
        set.remove(src);

        while(!q.isEmpty()){
            String s = q.remove();
            int step = map.get(s);

            for(int i=0;i<s.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char[] arr = s.toCharArray();
                    arr[i] = ch;
                    String newString = new String(arr);

                    if(set.contains(newString)){
                        set.remove(newString);
                        q.add(newString);
                        map.put(newString,step+1);
                    }
                }
            }
        }
        
        ans = new ArrayList<>();

        if(map.containsKey(target)){
            List<String> list = new ArrayList<>();
            list.add(target);
            dfs(target,list);
        }

        return ans;
    }
}