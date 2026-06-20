class Trie {
    public class Node{
        Node[] children;
        boolean endOfWord;

        public Node(){
            children = new Node[26];
            Arrays.fill(children, null);
            endOfWord = false;
        }
    }
    public Node root;

    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node node = root;
        for (int i = 0;i < word.length();i++){
            int idx = word.charAt(i) - 'a';

            if (node.children[idx] == null){
                node.children[idx] = new Node();
            }
            if (i == word.length()-1) node.children[idx].endOfWord = true;
            node = node.children[idx];
        }
    }
    
    public boolean search(String word) {
        Node node = root;
        for (int i = 0;i < word.length();i++){
            int idx = word.charAt(i) - 'a';

            if (node.children[idx] == null) return false;
            if (i == word.length()-1 && node.children[idx].endOfWord == false) return false;

            node = node.children[idx];
        }

        return true;
    }
    
    public boolean startsWith(String prefix) {
        Node node = root;
        for (int i = 0;i < prefix.length();i++){
            int idx = prefix.charAt(i) - 'a';

            if (node.children[idx] == null) return false;
            node = node.children[idx];
        }

        return true;
    }
}