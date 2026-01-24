class MyHashMap {
    ArrayList<Integer> arr1;
    ArrayList<Integer> arr2;
    public MyHashMap() {
        arr1 =  new ArrayList<>();
        arr2 =  new ArrayList<>();
    }
    
    public void put(int key, int value) {
        if(arr1.contains(key)){
            int idx = arr1.indexOf(key);

            arr2.set(idx,value);
        }
        else {
            arr1.add(key);
            arr2.add(value);
        }
    }
    
    public int get(int key) {
        if(arr1.contains(key)){
            int idx = arr1.indexOf(key);

            return arr2.get(idx);
        }
        else return -1;
    }
    
    public void remove(int key) {
        if(arr1.contains(key)){
            int idx = arr1.indexOf(key);

            arr1.remove(idx);
            arr2.remove(idx);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */