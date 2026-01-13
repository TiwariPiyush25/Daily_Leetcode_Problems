class Solution {
    public int numberOfArithmeticSlices(int[] arr) {
        if(arr.length<3) return 0;

        int st = 0;
        int end = 2;

        int count = 0;
        while(end<arr.length){
            if(arr[st+1] - arr[st] == arr[end] - arr[end-1]) count+= (end - (st + 2)) + 1;
            
            if(arr[st+1] - arr[st] != arr[end] - arr[end-1]) {
                st = end-1;
                end++;

                while(end<arr.length && arr[st+1] - arr[st] != arr[end] - arr[end-1]){
                    st++;
                    end++;
                }
            }
            else end++;
        }

        return count;
    }
}