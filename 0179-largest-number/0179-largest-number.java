class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        int i = 0;
        for(int ele:nums){
            arr[i++] = ""+ele;
        }
        Arrays.sort(arr, (x,y) -> (y + x).compareTo(x + y));

        i = 0;
        String ans = "";
        while(i < nums.length){
            ans += arr[i++];
        }

        return ans.charAt(0) == '0' ? "0" : ans;
    }
}