class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String ans = "";

        int i = 0;
        while(i < 4){
            ans = Math.min(num1%10,Math.min(num2%10,num3%10)) + ans;

            num1 /= 10;
            num2 /= 10;
            num3/= 10; 
            i++;
        }

        return Integer.parseInt(ans);
    }
}