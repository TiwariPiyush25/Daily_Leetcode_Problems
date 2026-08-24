class Solution {
    public int minDeletionSize(String[] strs) {
        int counter = 0;

        for (int j = 0; j < strs[0].length(); j++) {
            for (int i = 1; i < strs.length; i++) {
                if(strs[i].charAt(j) < strs[i-1].charAt(j)){
                    counter++;
                    break;
                }
            }
        }

        return counter;
    }
}