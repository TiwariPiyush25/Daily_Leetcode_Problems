class Solution {
    public class pair{
        String s;
        int len;

        pair(String s,int l){
            this.s = s;
            this.len = l;
        }
    }
    public int ladderLength(String src, String target, List<String> wordList) {
        HashSet<String> set = new HashSet<>();
        for(String s:wordList){
            set.add(s);
        } 

        Queue<pair> q = new LinkedList<>();
        q.add(new pair(src,1));
        set.remove(src);

        while(!q.isEmpty()){
            pair top = q.remove();
            String s = top.s;int len  = top.len;

            if(s.equals(target)) return len;
            for(int i=0;i<s.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char[] arr = s.toCharArray();
                    arr[i] = ch;
                    String newString = new String(arr);

                    if(set.contains(newString)){
                        set.remove(newString);
                        q.add(new pair(newString,len+1));
                    }
                }
            }
        }

        return 0;
    }
}