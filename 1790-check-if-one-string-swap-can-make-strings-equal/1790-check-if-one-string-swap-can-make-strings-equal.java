class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int cnt = 0;
        int[] freq = new int[26];
        for(int i = 0;i < s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)) cnt++;
            
            int idx1 = (int) s1.charAt(i) - 'a';
            freq[idx1]++;
            int idx2 = (int) s2.charAt(i) - 'a';
            freq[idx2]--;
        }
        
        for(int ele : freq) if(ele != 0) return false;
        return cnt == 2 || cnt == 0;
    }
}