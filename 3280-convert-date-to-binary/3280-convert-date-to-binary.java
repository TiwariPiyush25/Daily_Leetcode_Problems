class Solution { 
    public String binary(int n){
        String ans = "";
        while(n >= 2){
            int rem = n % 2;
            ans = rem + ans;
            n /= 2;
        }
        if(n == 1) ans = 1 + ans;
        return ans;
    }
    public String convertDateToBinary(String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int d = Integer.parseInt(date.substring(8));

        return binary(year)+"-"+binary(month)+"-"+binary(d);
    }
}