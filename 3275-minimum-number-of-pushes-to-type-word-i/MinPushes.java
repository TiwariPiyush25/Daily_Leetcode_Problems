class Solution {
    public int minimumPushes(String word) {
        int total = word.length();

        int pushes = 0;
        while(total>0){
            pushes += total;
            total-=8;
        }

        return pushes;
    }
}
