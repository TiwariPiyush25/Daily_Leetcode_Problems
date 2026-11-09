class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(j < s1.length()){
            if(s1.charAt(j) != s2.charAt(j)){
                j++;
            }
            else {
                if(i != j){
                    String x1 = s1.substring(i,j);
                    String x2 = s2.substring(i,j);

                    List<String> temp = new ArrayList<>();
                    temp.add(x1); temp.add(x2);

                    ans.add(temp);
                }

                j++;
                i = j;
            }
        }

        if(i != j) {
            String x1 = s1.substring(i);
            String x2 = s2.substring(i);

            List<String> temp = new ArrayList<>();
            temp.add(x1); temp.add(x2);

            ans.add(temp);
        }
        
        return ans;
    }
}