class Solution {
    public class Node{
        Node[] children;
        boolean endOfWord;

        public Node(){
            children = new Node[26];
            Arrays.fill(children, null);
            endOfWord = false;
        }
    }

    public Node root = new Node(); // always Empty only contains children value

    public void insert(String word){
        Node node = root;
        for (int i = 0;i < word.length();i++){ // O(L)
            int idx = word.charAt(i) - 'a';

            if (node.children[idx] == null){ // add new Node
                node.children[idx] = new Node();
            }
            if (i == word.length()-1) node.children[idx].endOfWord = true;
            node = node.children[idx];
        }
    }

    public boolean search(String word){
        Node node = root;
        for (int i = 0;i < word.length();i++){ // O(L)
            int idx = word.charAt(i) - 'a';

            if (node.children[idx] == null) return false;
            if (i == word.length()-1 && node.children[idx].endOfWord == false) return false;

            node = node.children[idx];
        }

        return true;
    }
    public boolean wordbreak(String key,HashMap<String,Boolean> dp){
        if (key.length() == 0) return true;

        if(dp.containsKey(key)) return dp.get(key);
        boolean ans = false;
        for (int i = 1;i <= key.length();i++){
            String firstPart = key.substring(0,i);
            String SecondPart = key.substring(i);

            if (search(firstPart) && wordbreak(SecondPart,dp)){
                ans = true;
                break;
            }
        }
        dp.put(key,ans);
        return ans;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String,Boolean> dp = new HashMap<>();
        for (String word : wordDict){
            insert(word);
        }

        return wordbreak(s,dp);
    }
}