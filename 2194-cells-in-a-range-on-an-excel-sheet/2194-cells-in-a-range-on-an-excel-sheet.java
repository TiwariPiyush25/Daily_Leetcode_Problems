class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();

        char c1 = s.charAt(0);
        int n1 = (int) s.charAt(1) - '0';
        char c2 = s.charAt(3);
        int n2 = (int) s.charAt(4) - '0';

        for(char ch = c1;ch <= c2; ch++){
            for(int i = n1;i <= n2;i++){
                String t = "" + ch + i;

                ans.add(t);
            }
        }

        return ans;
    }
}