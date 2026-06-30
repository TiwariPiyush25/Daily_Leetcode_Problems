class Solution {
    public int numberOfSubstrings(String s) {
        int st = 0;
        int end = 0;
        int n = s.length();

        int count = 0;
        int[] fre = new int[3];

        while(end < n){
            fre[(int) s.charAt(end)-'a']++;

            while(fre[0] > 0 && fre[1] > 0 && fre[2] > 0){
                count += (n - end);
                fre[(int) s.charAt(st)-'a']--;
                st++;
            }
            end++;
        }

        return count;
    }
}