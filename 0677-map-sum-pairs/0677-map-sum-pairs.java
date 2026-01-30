class MapSum {
    HashMap<String,Integer> map;

    public MapSum() {
        map = new HashMap<>();
    }
    
    public void insert(String key, int val) {
        map.put(key,val);
    }
    
    public int sum(String prefix) {
        int sum = 0;
        int len = prefix.length();

        for(String key:map.keySet()){
            if(key.length()>=len && prefix.equals(key.substring(0,len))){
                sum += map.get(key);
            }
        }

        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */