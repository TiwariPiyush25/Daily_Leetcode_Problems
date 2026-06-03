class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String,Integer> map = new HashMap<>();
        int count = 0;
        for(int[] domino : dominoes){
            int a = domino[0] , b = domino[1];

            if(map.containsKey(a+"-"+b)){
                count += map.get(a+"-"+b);
                map.put(a+"-"+b,map.get(a+"-"+b)+1);
            }
            else if(map.containsKey(b+"-"+a)){
                count += map.get(b+"-"+a);
                map.put(b+"-"+a,map.get(b+"-"+a)+1);
            }
            else {
                map.put(a+"-"+b , 1);
            }
        }

        return count;
    }
}