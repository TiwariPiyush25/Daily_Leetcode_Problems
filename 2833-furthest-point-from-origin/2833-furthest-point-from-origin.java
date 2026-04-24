class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0;
        
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i) == 'L') left++;
            else if(moves.charAt(i) == 'R') right++;
        }

        int space = moves.length() - (left + right);

        int max = Math.max(left,right);
        int min = Math.min(left,right);

        return max - min + space;
    }
}