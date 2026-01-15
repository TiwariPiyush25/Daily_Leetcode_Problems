class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean[] isSet = new boolean[32];

        for(int i = 0;i<=31;i++){
            int mask = 1 << i;

            if((n & (mask)) !=0) isSet[i] = true;
            System.out.println(mask);
            if(i>0 && ((isSet[i-1] && isSet[i]) || (!isSet[i-1] && !isSet[i])) && mask < n) return false;
            if(mask >= n) break;
        }

        return true;
    }
}