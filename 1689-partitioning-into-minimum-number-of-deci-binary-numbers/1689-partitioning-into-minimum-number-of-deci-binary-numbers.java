class Solution {
    public int minPartitions(String n) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n.length();i++){
            int num = (int) n.charAt(i) - '0';
            max = Math.max(max,num);
        }

        return max;
    }
}