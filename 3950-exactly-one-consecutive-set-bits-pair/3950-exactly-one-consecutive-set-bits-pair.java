class Solution {
    public boolean consecutiveSetBits(int n) {
        List<Integer> list = new ArrayList<>();

        while(n >= 2){
            int rem = n % 2;
            list.add(rem);
            n /= 2;
        }
        if(n == 1) list.add(1);

        int cnt = 0;
        for(int i = 1;i < list.size();i++){
            if(list.get(i) == 1 && list.get(i-1) == 1) cnt++;
        }
        return cnt == 1;
    }
}