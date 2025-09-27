class Solution {
    public boolean isSelfDividing(int n){
        int copy=n;

        while(copy>0){
            int ld=copy%10;
            if(ld==0 || n%ld!=0) return false;

            copy/=10;
        }

        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr=new ArrayList<>();
        for(;left<=right;left++){
            if(isSelfDividing(left)) arr.add(left);
        }

        return arr;
    }
}