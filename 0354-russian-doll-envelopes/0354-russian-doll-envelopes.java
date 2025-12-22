class Solution {
    public class Envelop implements Comparable<Envelop>{
        int w;
        int h;
        Envelop(int w,int h){
            this.w=w;
            this.h=h;
        }

        public int compareTo(Envelop e){
            if (this.w == e.w) return e.h - this.h;
            return this.w - e.w;
        }
    }
    public int binarySearch(int[] arr,int st,int end,int target){
        while (st<end){
            int mid = st+ (end-st)/2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] >  target) end = mid;
            else st = mid+1;
        }

        return st;
    }
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        Envelop[] arr = new Envelop[n];

        for (int i =0;i<n;i++){
            int w = envelopes[i][0];
            int h = envelopes[i][1];
            arr[i] = new Envelop(w,h);
        }

        Arrays.sort(arr);
        // LIS ON height
        int[] dp = new int[n];

        int maxlen = 0;
        for (int i=0;i<n;i++){
            // find the index of height of arr[i]
            int index = binarySearch(dp,0,maxlen,arr[i].h);

            dp[index] = arr[i].h;

            if (index == maxlen){
                maxlen++;
            }
        }

        return maxlen;
    }

}