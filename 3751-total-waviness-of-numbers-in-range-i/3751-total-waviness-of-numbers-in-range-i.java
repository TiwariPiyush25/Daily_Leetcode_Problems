class Solution {
    public int totalWaviness(int num1, int num2) {
        int count = 0;
        for(int i=num1;i<=num2;i++){
            String temp = "" + i;
            int waviness = 0;
            if(temp.length()>=3){
                for(int j = 1;j<temp.length()-1;j++){
                    if((int)temp.charAt(j)>(int)temp.charAt(j-1) && (int)temp.charAt(j) > (int)temp.charAt(j+1)) waviness++;

                    if((int)temp.charAt(j)<(int)temp.charAt(j-1) && (int)temp.charAt(j) < (int)temp.charAt(j+1)) waviness++;
                }
            }
            count+= waviness;
        }

        return count;
    }
}