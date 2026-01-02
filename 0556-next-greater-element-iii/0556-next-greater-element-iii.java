class Solution {
    public void swap(List<Integer> arr,int i,int j){
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    public void reverse(List<Integer> arr,int i,int j){
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++; j--;
        }
    }
    public int nextGreaterElement(int n) {
        List<Integer> arr = new ArrayList<>();

        while(n>0){
            arr.add(0,n%10);
            n/=10;
        }
        int i=arr.size()-1;
        while(i>0 && arr.get(i-1) >= arr.get(i)){
            i--;
        }

        if(i==0) return -1;
        int min = Integer.MAX_VALUE;
        int minidx = -1;
        for(int j = arr.size()-1;j>=i;j--){
            if(arr.get(j) < min && arr.get(j) > arr.get(i-1)){
                min = arr.get(j);
                minidx = j;
            }
        }
        
        swap(arr,i-1,minidx);
        Collections.sort(arr.subList(i,arr.size()));

        long num=0;
        for(int ele:arr) num = num*10 + ele;

        if(num>Integer.MAX_VALUE) return -1;
        return (int)num;
    }
}