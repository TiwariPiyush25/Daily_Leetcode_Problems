class Solution {
    public int countOdds(int low, int high) {
        int tillLow = (low + 1) / 2;
        int tillHigh = (high + 1) / 2;

        System.out.println(tillLow + " " + tillHigh);
        if(low % 2 != 0) tillLow--; 
        return tillHigh - tillLow;
    }
}