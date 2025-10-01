class Solution {
    public boolean checkRecord(String s) {
        int count=0; // absent count

        int maxLeaves=0;
        int leaves=0;
        for(int i=0;i<s.length();i++){
            // count all absent
            if(s.charAt(i)=='A') count++;

            // count consecutive leaves
            if(s.charAt(i)=='L') leaves++;
            else {
                maxLeaves=Math.max(maxLeaves,leaves);
                leaves=0;
            }
        }
        maxLeaves=Math.max(maxLeaves,leaves);
        
        if(count>=2 || maxLeaves>=3) return false;
        return true;
    }
}