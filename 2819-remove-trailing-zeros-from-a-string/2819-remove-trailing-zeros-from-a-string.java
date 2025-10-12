class Solution {
    public String removeTrailingZeros(String num) {
        int i=num.length()-1;

        while(num.charAt(i)=='0'){
            i--;
        }

        StringBuilder sb=new StringBuilder();
        for(int j=0;j<=i;j++){
            sb.append(num.charAt(j));
        }

        return sb.toString();
    }
}