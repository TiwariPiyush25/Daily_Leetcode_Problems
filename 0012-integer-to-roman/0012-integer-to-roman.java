class Solution {
    public String valueOf(int[] arr){
        if(arr[0] >= 1000){
            arr[0] -= 1000;
            return "M";
        }
        if(arr[0] >= 900){
            arr[0] -= 900;
            return "CM";
        }
        if(arr[0] >= 500){
            arr[0] -= 500;
            return "D";
        }
        if(arr[0] >= 400){
            arr[0] -= 400;
            return "CD";
        }
        if(arr[0] >= 100){
            arr[0] -= 100;
            return "C";
        }
        if(arr[0] >= 90){
            arr[0] -= 90;
            return "XC";
        }
        if(arr[0] >= 50){
            arr[0] -= 50;
            return "L";
        }
        if(arr[0] >= 40){
            arr[0] -= 40;
            return "XL";
        }
        if(arr[0] >= 10){
            arr[0] -= 10;
            return "X";
        }
        if(arr[0] >= 9){
            arr[0] -= 9;
            return "IX";
        }
        if(arr[0] >= 5){
            arr[0] -= 5;
            return "V";
        }
        if(arr[0] >= 4 && arr[0] < 5){
            arr[0] -= 4;
            return "IV";
        }

        arr[0] -= 1;
        return "I";
    }
    public String intToRoman(int num) {
        String ans = "";
        while(num > 0){
            int[] arr = {num};
            String val = valueOf(arr);

            ans += val;
            num = arr[0];
        }

        return ans;
    }
}