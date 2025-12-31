class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int j = 0;

        int balance = 0;
        while(j<s.length()){
            if(j!=0 && balance==0) count++;

            if(s.charAt(j) == 'L') balance++;
            else balance--;

            j++;
        }
        if(balance == 0) count++;

        return count;
    }
}