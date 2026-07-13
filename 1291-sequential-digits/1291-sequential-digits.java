class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        for(int i = 1;i <= 9;i++){
            int nextDigit = (i % 10) + 1;
            int num = i;

            while(num <= high && nextDigit <= 9){
                num = num * 10 + nextDigit;

                if(num >= low && num <= high) {
                    ans.add(num);
                }
                nextDigit++;
            }
        }

        ans.sort(null);
        return ans;
    }
}