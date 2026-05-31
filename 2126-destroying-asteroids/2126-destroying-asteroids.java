class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long Mass = (long) mass;
        for(int ast : asteroids){
            if(Mass >= ast){
                Mass += ast;
            }
            else return false;
        }

        return true;
    }
}