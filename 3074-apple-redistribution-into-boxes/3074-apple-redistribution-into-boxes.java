class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total = 0;
        for(int ele:apple){
            total += ele;
        }

        Arrays.sort(capacity);
        int currCap = 0;

        int i=capacity.length-1;
        while(i>=0 && currCap < total){
            currCap += capacity[i];
            i--;
        }

        return capacity.length - i - 1;
    }
}