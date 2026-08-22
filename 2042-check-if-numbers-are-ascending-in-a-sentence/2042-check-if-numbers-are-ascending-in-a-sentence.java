class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        int prev = 0;

        for(var x : arr){
            if(x.charAt(0) >= '1' && x.charAt(0) <= '9'){
                int val = Integer.valueOf(x);

                if(val <= prev) return false;
                prev = val;
            }
        }

        return true;
    }
}