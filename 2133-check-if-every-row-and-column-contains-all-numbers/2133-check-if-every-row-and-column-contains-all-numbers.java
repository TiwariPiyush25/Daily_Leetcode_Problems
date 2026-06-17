class Solution {
    public boolean checkValid(int[][] matrix) {
        int m = matrix.length , n = matrix[0].length;
        
        // check row
        for(int[] mat : matrix){
            HashSet<Integer> set = new HashSet<>();

            for(int ele : mat){
                set.add(ele);
            }
            
            if(set.size() != n) return false;
        }

        // check col
        for(int j = 0;j < n;j++){
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0;i < m;i++){
                set.add(matrix[i][j]);
            }
            if(set.size() != n) return false;
        }

        return true;
    }
}