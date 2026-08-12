class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i = 1;i <= n;i++){
            int val = i;
            int remaining = n - i;

            String s = ""+val;
            String r = ""+remaining;

            if(s.indexOf('0') == -1 && r.indexOf('0') == -1) return new int[]{val , remaining};
        }

        return new int[0];
    }
}