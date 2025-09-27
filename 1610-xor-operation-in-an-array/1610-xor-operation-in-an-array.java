class Solution {
    public int xorOperation(int n, int start) {
        int ele=start;  // beacuse (0 * 2) == 0
        for(int i=1;i<n;i++){
            ele = ele ^ (start + i * 2);
        }

        return ele;
    }
}