class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int size = colsum.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i < 2;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0;j < size;j++){
                temp.add(0);
            }
            ans.add(temp);
        }
        for(int j = 0;j < size;j++){
            if(colsum[j] == 2){
                upper--; lower--;
                ans.get(0).set(j,1);
                ans.get(1).set(j,1);
            }
        }
        for(int j = 0;j < size;j++){
            if(colsum[j] == 0 || colsum[j] == 2) continue;

            if(upper > 0) {
                ans.get(0).set(j,1);
                upper--;
            }
            else {
                ans.get(1).set(j,1);
                lower--;
            }
        }

        return (upper != 0 || lower != 0) ? new ArrayList<>() : ans;
    }
}