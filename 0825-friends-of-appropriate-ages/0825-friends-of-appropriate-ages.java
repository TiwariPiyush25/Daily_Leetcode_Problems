class Solution {
    public boolean check(int x,int y){
        return (y <= (x / 2) + 7) || (y > x) || (y > 100 && x < 100);
    }
    public int numFriendRequests(int[] ages) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : ages){
            map.put(ele , map.getOrDefault(ele,0)+1);
        }
        
        for(int key : map.keySet()){
            int n = map.get(key);
            if (!check(key, key)) count += (n * (n-1));
        }

        for(int x : map.keySet()){
            for(int y : map.keySet()){
                if(x != y && !check(x,y)){
                    count += map.get(x) * map.get(y);
                }
            }
        }

        return count;
    }
}