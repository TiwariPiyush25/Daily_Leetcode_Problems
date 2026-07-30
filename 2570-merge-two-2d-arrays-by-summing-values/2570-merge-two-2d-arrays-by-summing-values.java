class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int[] num : nums1){
            set.add(num[0]);
        }
        for(int[] num : nums2){
            set.add(num[0]);
        }

        int len = set.size();
        int[][] ans = new int[len][2];

        int i = 0;
        int j = 0;
        int k = 0; 
        while(i < nums1.length && j < nums2.length){
            if(nums1[i][0] < nums2[j][0]){
                ans[k][0] = nums1[i][0];
                ans[k][1] = nums1[i][1]; 
                i++; k++;
            }
            else if(nums1[i][0] > nums2[j][0]){
                ans[k][0] = nums2[j][0];
                ans[k][1] = nums2[j][1]; 
                j++; k++;
            }
            else {
                ans[k][0] = nums1[i][0];
                ans[k][1] = nums1[i][1] + nums2[j][1]; 
                i++; j++; k++;
            }
        }

        while(i < nums1.length){
            ans[k][0] = nums1[i][0];
            ans[k][1] = nums1[i][1]; 
            i++; k++;
        }

        while(j < nums2.length){
            ans[k][0] = nums2[j][0];
            ans[k][1] = nums2[j][1]; 
            j++; k++;
        }

        return ans;
    }
}