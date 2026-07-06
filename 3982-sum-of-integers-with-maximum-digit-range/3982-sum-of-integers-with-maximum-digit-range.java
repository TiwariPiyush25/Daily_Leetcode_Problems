class Solution {
    public int range(int n){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        while(n > 0){
            int ld = n % 10;
            min = Math.min(ld,min);
            max = Math.max(ld,max);
            n /= 10;
        }

        return max - min;
    }
    public int maxDigitRange(int[] nums) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for(int ele : nums){
            int r = range(ele);
            max = Math.max(max ,r);

            if(!map.containsKey(r)) map.put(r,new ArrayList<>());
            map.get(r).add(ele);
        }

        int sum = 0;
        for(int ele : map.get(max)){
            sum += ele;
        }

        return sum;
    }
}