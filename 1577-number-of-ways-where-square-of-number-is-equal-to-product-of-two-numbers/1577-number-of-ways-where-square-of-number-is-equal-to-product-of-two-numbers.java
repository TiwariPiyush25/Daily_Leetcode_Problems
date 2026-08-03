class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        HashMap<Long,Long> map1 = new HashMap<>();
        for(int ele : nums1){
            long val = (long) ele * (long) ele;

            map1.put(val ,(long) map1.getOrDefault(val , 0L) + 1);
        }

        HashMap<Long,Long> map2 = new HashMap<>();
        for(int ele : nums2){
            long val = (long) ele * (long) ele;

            map2.put(val ,(long) map2.getOrDefault(val , 0L) + 1);
        }

        int cnt = 0;
        // Type 2
        for(int j = 0;j < nums1.length;j++){
            for(int k = j + 1;k < nums1.length;k++){
                long val = (long) nums1[j] * (long) nums1[k];

                if(map2.containsKey(val)) cnt += map2.get(val);
            }
        }

        // Type 1
        for(int j = 0;j < nums2.length;j++){
            for(int k = j + 1;k < nums2.length;k++){
                long val = (long) nums2[j] * (long) nums2[k];

                if(map1.containsKey(val)) cnt += map1.get(val);
            }
        }

        return cnt;
    }
}