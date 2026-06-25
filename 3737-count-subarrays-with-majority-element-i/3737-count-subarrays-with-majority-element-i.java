class Solution {
    public int countMajoritySubarrays(int[] arr, int t) {
        boolean flag = false; 
        for(int ele:arr){
            if(ele == t) flag = true;
        }

        if(!flag) return 0;

        int n = arr.length;
        int total = 0;
        for(int i = 0; i < n ; i++){
            int count = 0;
            for(int j=i;j<n;j++){
                if(arr[j] == t) count++;

                if(count > (j-i+1)/2) total++;
            }

        }

        return total;
    }
}