class Solution {
    public int titleToNumber(String columnTitle) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=columnTitle.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int val=(int)(columnTitle.charAt(i))-64;
            
            ans = ans*26+ val;
        }

        return ans;
    }
}