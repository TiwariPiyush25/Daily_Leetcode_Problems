class Solution {
    public int numSplits(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int[] prefixArray = new int[n];
        int[] suffixArray = new int[n];
        for(int i = 0;i < n;i++){
            set.add(s.charAt(i));
            prefixArray[i] = set.size();
        }
        set.clear();

        for(int i = n - 1;i >= 0;i--){
            set.add(s.charAt(i));
            suffixArray[i] = set.size();
        }
        int counter = 0;
        for(int i = 0;i < n - 1;i++){
            if(prefixArray[i] == suffixArray[i + 1]) counter++;
        }
        return counter;
    }
}