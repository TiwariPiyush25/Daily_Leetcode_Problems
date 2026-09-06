class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        
        int counter = 0;
        for(int rotation = 0;rotation < n;rotation++){
            String res = "";
            char ch = s.charAt(0);

            res = s.substring(1) + ch;
            int score = 0;
            for(int i = 1;i < n;i++){
                if(res.charAt(i) == res.charAt(i-1)) score++;
            }

            if(score == k) counter++;
            s = res;
        }

        return counter;
    }
}