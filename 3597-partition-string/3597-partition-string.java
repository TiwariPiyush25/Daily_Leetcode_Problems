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

    public Node root = new Node();

    public void insert(String word){
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

    public boolean search(String word){
        Node node = root;
        for (int i = 0;i < word.length();i++){
            int idx = word.charAt(i) - 'a';

            if (node.children[idx] == null) return false;
            if (i == word.length()-1 && !node.children[idx].endOfWord) return false;

            node = node.children[idx];
        }

        return true;
    }
    public List<String> partitionString(String s) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        int j = 1;

        while(j < s.length()){
            while(j < s.length() && search(s.substring(i,j))){
                j++;
            }

            if(!search(s.substring(i,j))){
                ans.add(s.substring(i,j));
                insert(s.substring(i,j));
                i = j;
            }
        }

        if(!search(s.substring(i,j))){
            ans.add(s.substring(i,j));
        }
        
        return ans;
    }
}