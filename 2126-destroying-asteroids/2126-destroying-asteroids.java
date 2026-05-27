class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        for(int ast : asteroids){
            if(mass >= ast){
                mass += ast;
            }
            else return false;
        }

        return true;
    }
}