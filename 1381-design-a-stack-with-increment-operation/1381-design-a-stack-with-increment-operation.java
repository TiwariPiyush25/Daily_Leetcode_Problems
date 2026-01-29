class CustomStack {
    int[] arr;
    int i;
    public CustomStack(int maxSize) {
        i = 0;
        arr = new int[maxSize];
    }
    
    public void push(int x) {
        if(i == arr.length) return;

        arr[i++] = x;
    }
    
    public int pop() {
        if(i==0) return -1;

        int x = arr[i-1];
        arr[i-1] = 0;
        i--;

        return x;
    }
    
    public void increment(int k, int val) {
        if(i<k){
            for(int j=0;j<i;j++){
                arr[j] += val; 
            }
        }
        else{
            for(int j=0;j<k;j++){
                arr[j] += val; 
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */