class Solution {
    public class Node{
        Node[] children;
        boolean eow; // endOfWord

        public Node(){
            children = new Node[26]; // a to z
            for (int i=0;i<26;i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    public Node root = new Node();
    public void insert(String word){ 
        Node curr = root;
        for (int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null){ // add new Node
                curr.children[idx] = new Node();
            }
            if (i == word.length()-1){
                curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }
    }
    public boolean search(String key){
        Node curr = root;
        for (int i=0;i<key.length();i++){
            int idx = key.charAt(i) - 'a';

            if (curr.children[idx] == null){
                return false;
            }
            if (i == key.length()-1 && !curr.children[idx].eow){
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }
    
    public HashMap<String,Boolean> map;
    public boolean WordBreak(String key){
        if (key.length() == 0) return true;
        
        if(map.containsKey(key)) return map.get(key);
        
        for (int i = 1;i <= key.length();i++){
            String left = key.substring(0,i);
            String right = key.substring(i);

            if (search(left) && WordBreak(right)){
                map.put(key,true);
                return true;
            }
        }
        
        map.put(key,false);
        return false;
    }
    
    public boolean wordBreak(String s, List<String> wordDict) { 
        map = new HashMap<>();
        
        // create Trie
        for (String word : wordDict){
            insert(word);
        }
        return WordBreak(s);
    }
}