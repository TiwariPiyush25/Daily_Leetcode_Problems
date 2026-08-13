class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        
        int fre = 0 , moves = 0;
        for(int i = 0;i < boxes.length();i++){
            if(boxes.charAt(i) == '1'){
                fre++;
            }

            ans[i] += moves;
            moves += fre;
        }

        fre = 0 ; moves = 0;
        for(int i = boxes.length()-1;i >= 0;i--){
            if(boxes.charAt(i) == '1'){
                fre++;
            }

            ans[i] += moves;
            moves += fre;
        }
        return ans;
    }
}