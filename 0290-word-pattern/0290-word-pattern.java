class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        char[] A = pattern.toCharArray();
        String[] B = s.split(" ");

        if(A.length != B.length) return false;
        for(int i = 0;i < A.length;i++){
            if((map1.containsKey(A[i]) && !map1.get(A[i]).equals(B[i])) || (map2.containsKey(B[i]) && map2.get(B[i]) != A[i])) return false;
            map1.put(A[i],B[i]);
            map2.put(B[i],A[i]);
        }

        return true;
    }
}