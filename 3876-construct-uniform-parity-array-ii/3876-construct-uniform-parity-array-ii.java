class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean flag = true;
        // check for all even
        for(int ele:nums1){
            if(ele%2!=0) {
                flag = false;
                break;
            }
        }
        if(flag) return true;
        // check for all odd
        for(int ele:nums1){
            if(ele%2==0) {
                flag = false;
                break;
            }
        }

        if(flag) return true;

        flag = true;
        int mineven = Integer.MAX_VALUE;
        int minodd = Integer.MAX_VALUE;

        for(int ele:nums1){
            if(ele%2==0) mineven = Math.min(mineven,ele);
            if(ele%2!=0) minodd = Math.min(minodd,ele);
        }

        return mineven > minodd;
    }
}