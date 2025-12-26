class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map = new HashMap<>(); // map of fre of group
        for (int answer:answers){
            map.put(answer + 1,map.getOrDefault(answer + 1,0) + 1);
        }

        int rabbit = 0;
        for (int key : map.keySet()){
            int count = map.get(key) / key; // q groups
            int rem = map.get(key) % key;

            rabbit += (count * key);
            if (rem > 0) rabbit += key; // one more group
        }

        return rabbit;
    }
}