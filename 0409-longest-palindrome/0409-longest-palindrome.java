class Solution {
    public int longestPalindrome(String s) {
        /*
        If we want to make longest palindrome string then we have two frequencies of characters odd and even , we selects all even frequencies and max from odd frequencies for middle and other odd frequencies with (frequency-1) frequencies 
        */
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int len = 0;
        int maxoddfre = 0;
        for(char key : map.keySet()){
            int val = map.get(key);

            if(val % 2==0){
                len+= val;
            }
            else{
                if(val > maxoddfre){
                    if(maxoddfre > 0) len -= 1;
                    len += val;
                    maxoddfre = val;
                }
                else {
                    len += (val-1);
                }
            }
        }

        return len;
    }
}