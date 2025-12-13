class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> map1 =new HashMap<>();
        HashMap<Character,Integer> map2 =new HashMap<>();

        for(int i=0;i<s.length();i++){
            map1.put(s.charAt(i),i);
            map2.put(t.charAt(i),i);
        }

        System.out.println(map1);
        int sum = 0;
        for(var key : map1.keySet()){
            sum += Math.abs(map1.get(key)-map2.get(key));
        }

        return sum;
    }
}