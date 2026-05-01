class Solution {
    public int Convert(String s){
        if(s.charAt(0) == '-') return -1 * Integer.parseInt(s.substring(1));
        return Integer.parseInt(s);
    }
    public String complexNumberMultiply(String num1, String num2) {
        int i1 = num1.indexOf("+"); int i2 = num2.indexOf("+");

        String x1 = num1.substring(0,i1); String x2 = num1.substring(i1+1);
        String y1 = num2.substring(0,i2); String y2 = num2.substring(i2+1);

        int a1 = Convert(x1), b1 = Convert(x2.substring(0,x2.length()-1));
        int a2 = Convert(y1), b2 = Convert(y2.substring(0,y2.length()-1));;

        String ans = "" + ((a1*a2) + (b1*b2*-1))  + "+" + ((a1*b2) + (a2*b1)) + "i";

        return ans;
    }
}