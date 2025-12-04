class Solution {
    public int minOperations(int n) {
        int sum = 0;

        for(int i = 0;i<n;i++) sum+= (2*i) + 1;

        int avg = sum / n;

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++){
            set.add(Math.abs(avg - ((2*i) + 1)));
        }

        int total = 0;
        for(int ele:set){
            total+=ele;
        }

        return total;
    }
}