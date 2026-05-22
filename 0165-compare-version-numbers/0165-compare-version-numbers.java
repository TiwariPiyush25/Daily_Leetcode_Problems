class Solution {
    public int compareVersion(String version1, String version2) {
        String[] A = version1.split("\\.");
        String[] B = version2.split("\\.");

        for(int i = 0;i < Math.max(A.length,B.length);i++){
            int a = 0;
            if(i < A.length) a = Integer.parseInt(A[i]);
            int b = 0;
            if(i < B.length) b = Integer.parseInt(B[i]);

            if(a > b) return 1;
            if(a < b) return -1;
        }

        return 0;
    }   
}