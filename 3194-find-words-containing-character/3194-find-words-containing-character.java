class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> lst = new ArrayList<>();
        int i = 0;
        for(String word : words){
            int idx = word.indexOf(x);
            if(idx!=-1) lst.add(i);
            i++;
        }

        return lst;
    }
}