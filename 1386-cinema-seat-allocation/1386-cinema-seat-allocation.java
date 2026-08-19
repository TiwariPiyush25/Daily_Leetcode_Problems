class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();

        for(int[] rs : reservedSeats){
            int r = rs[0] , c = rs[1];

            if(!map.containsKey(r)){
                map.put(r,new HashSet<>());
            }

            map.get(r).add(c);
        }

        int total = (n - map.size()) * 2;
        for(int r : map.keySet()){
            int seat = 0;
            int groups = 0;
            for(int c = 2;c <= 9;c++){
                if(map.get(r).contains(c)){
                    if(seat >= 4) groups++;
                    seat = 0;
                }
                else {
                    if(seat > 0 || (seat == 0 && (c == 2 || c == 4 || c == 6))) seat++;
                    else continue;
                }
            }

            groups += (seat / 4);
            total += groups;
        }

        return total;
    }
}