class Solution {
    public boolean judgeCircle(String moves) {
        int Up=0;
        int Down=0;
        int Left=0;
        int Right=0;

        for(int i=0;i<moves.length();i++){
            int ch=moves.charAt(i);
        
            if(ch=='U') Up++;
            else if(ch=='D') Down++;
            else if(ch=='L') Left++;
            else Right++;
        }

        return Up==Down && Left==Right;
    }
}