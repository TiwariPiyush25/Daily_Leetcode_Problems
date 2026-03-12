class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        s += '&'; // never count
        int i = 0;
        int j = 0;

        List<List<Integer>> ans = new ArrayList<>();
        int cnt = 0;
        while(j<s.length()){
            if(s.charAt(i) == s.charAt(j)){
                cnt++;
            }
            else{
                if(cnt >= 3){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j-1);

                    ans.add(temp);
                }
                i = j;
                cnt = 1;
            }

            j++;
        }

        return ans;
    }
}