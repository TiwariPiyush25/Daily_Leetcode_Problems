class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<3) return false;
        int st=0;
        int end;

        int count = 0;
        for(end=0;end<3;end++){
            if(arr[end]%2!=0) count++;
        }
        
        if(count==3) return true;

        while(end<arr.length){
            if(arr[st]%2!=0) count--;
            st++;

            if(arr[end]%2!=0) count++;
            end++;

            if(count==3) return true;
        }

        return false;
    }
}