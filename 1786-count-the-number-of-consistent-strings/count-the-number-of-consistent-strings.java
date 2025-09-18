class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;

        for(String s:words){
            boolean flag=true;
            for(int i=0;i<s.length();i++){
                String ch=""+s.charAt(i);
                if(!allowed.contains(ch)) flag=false;
            }

            if(flag) count++;
        }

        return count;
    }
}