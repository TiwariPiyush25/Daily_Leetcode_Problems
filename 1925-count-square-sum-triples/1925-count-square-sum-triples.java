class Solution {
    public int countTriples(int n) {
        int counter = 0;
        for(int a = 1;a <= n;a++){
            for(int b = 1;b <= n;b++){
                int sum = (a * a) + (b * b);

                double sqrt = Math.sqrt(sum);
                if((int) sqrt != (int) Math.ceil(sqrt)) continue; // sqrt is Not an Integer
                if(sqrt >= 1 && sqrt <= n) counter++;
            }
        }

        return counter;
    }
}