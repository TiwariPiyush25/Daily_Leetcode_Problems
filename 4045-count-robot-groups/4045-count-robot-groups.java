class Solution {
    public int countGroups(int[] position, int[] speed, int distance) {
        int counter = 1, n = speed.length;

        int prev = n - 1;
        for(int i = n - 2;i >= 0;i--){
            int dist = position[i + 1] - position[i];

            if(dist <= distance || speed[i] > speed[prev]){
                continue;
            }
            
            counter++;
            prev = i;
        }

        return counter;
    }
}