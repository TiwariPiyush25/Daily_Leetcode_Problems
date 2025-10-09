class Solution {
    public int minOperations(int[] arr) {
        int val=arr[0];
        boolean flag=true;
        for(int i=1;i<arr.length;i++){ // check if all elements are equal 
            if(arr[i]!=val) flag=false;
        }

        return flag ? 0 : 1;
    }
}