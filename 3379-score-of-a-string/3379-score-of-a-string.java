class Solution {
    public int scoreOfString(String s) {
        int i = 0;
        int j = 1;
        
        int sum = 0;

        while(j<s.length()){
            int a = s.charAt(i);
            int b =s.charAt(j);
            sum += Math.abs(a-b);

            i++;
            j++;
        }

        return sum;
    }
}