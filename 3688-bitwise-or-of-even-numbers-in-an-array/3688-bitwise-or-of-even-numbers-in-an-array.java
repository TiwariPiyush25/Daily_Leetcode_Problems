class Solution {
    public int evenNumberBitwiseORs(int[] arr) {
        boolean flag=false;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) flag=true;
        }

        if(flag==false) return 0;
        int val=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                val = val | arr[i];
            }
        }

        return val;
    }
}