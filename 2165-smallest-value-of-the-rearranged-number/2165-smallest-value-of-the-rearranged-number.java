class Solution {
    public long smallestNumber(long num) {
        List<Integer> arr = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        boolean flag = true;
        if(num < 0) {
            num = -num;
            flag = false;
        }
        while(num > 0) {
            arr.add(0,(int) (num % 10L));
            if(num % 10 != 0) min = Math.min(min , (int)(num % (long)10));
            num /= 10;
        }

        Collections.sort(arr);
        if(!flag) {
            long val = 0;
            int i = arr.size() - 1;
            while(i >= 0) {
                val = val * 10 + arr.get(i--); 
            }

            return -val;
        }

        int c = 1;
        long val = min;

        for(int i = 0;i < arr.size();i++){
            if(arr.get(i) == min && c == 1) {
                c--;
                continue;
            }
            val = val * 10 + arr.get(i);
        }

        return val == Integer.MAX_VALUE ? 0 : val;
    }
}