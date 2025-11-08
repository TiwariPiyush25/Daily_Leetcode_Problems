class Solution {
    public HashMap<Integer,Integer> map = new HashMap<>();
    public boolean isHappy(int n) {
        if(n==1) return true;
        if(map.containsKey(n)) return false;

        int copy = n;
        int sum = 0;
        while(copy>0){
            int ld = copy%10;
            sum += ld*ld;
            copy /= 10;
        }
        map.put(n,sum);

        return isHappy(sum);
    }
}