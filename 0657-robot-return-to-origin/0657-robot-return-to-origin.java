class Solution {
    public boolean judgeCircle(String moves) {
        int UD = 0 , LR = 0; // UD = Up and Down Count ; LR =  Left and Right Count 

        for(int i=0;i<moves.length();i++){
            int ch=moves.charAt(i);
        
            if(ch=='U') UD++;
            else if(ch=='D') UD--;
            else if(ch=='L') LR++;
            else LR--;
        }

        return LR==0 && UD==0;
    }
}