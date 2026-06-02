class Solution {
    public int smallestNumber(int n) {
        int i = 1;
        while((1 << i) <= n){
            i++;
        }

        return (int) Math.pow(2 , i) - 1;
    }
}