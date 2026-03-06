class Solution {
    public boolean isOdd(char ch){
        return ch=='1' || ch=='3' || ch=='5' || ch=='7' || ch=='9';
    }
    public String largestOddNumber(String num) {
        int i=num.length()-1;

        while(i>=0 && !isOdd(num.charAt(i))){
            i--;
        }

        return num.substring(0,i+1);
    }
}