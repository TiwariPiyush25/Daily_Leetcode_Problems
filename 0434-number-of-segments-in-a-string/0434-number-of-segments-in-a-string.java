class Solution {
    public int countSegments(String s) {
        if(s.length()==0) return 0;

        String[] res = s.split(" ");
        
        int count = 0;
        for(String a:res){
            if(a.length()>0) count++;
        }

        return count;
    }
}