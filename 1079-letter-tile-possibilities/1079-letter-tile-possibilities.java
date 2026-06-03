class Solution {
    public void helper(String s,String res,HashSet<String> ans){
        if(s.length() == 0) {
            ans.add(res);
            return;
        }

        for(int i = 0;i < s.length();i++){
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            String rem = left + right;
            helper(rem , res + s.charAt(i),ans);
            helper(rem , res , ans);
        }
    }
    public int numTilePossibilities(String tiles) {
        HashSet<String> ans = new HashSet<>();
        helper(tiles,"",ans);
        return ans.size() - 1;
    }
}