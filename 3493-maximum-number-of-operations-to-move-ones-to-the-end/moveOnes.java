class Solution {
    public int maxOperations(String s) {
        int Ones = 0, count =0;

        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                Ones++;
            }
            else if(i>0 && s.charAt(i-1)=='1'){
                count+=Ones;
            }
        }

        return count;
    }
}
