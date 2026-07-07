class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k <= numOnes) return k;

        int sum = numOnes;
        k -= numOnes;
        if(k < numZeros) return sum;
        else k -= numZeros;
        return sum - k;
    }
}