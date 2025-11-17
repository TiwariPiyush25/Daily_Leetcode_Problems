class Solution {
    public boolean kLengthApart(int[] arr, int k) {
        int n =arr.length;
        ArrayList<Integer> lst = new ArrayList<>();

        for(int i = 0;i<n;i++){
            if(arr[i]==1) lst.add(i); 
        }
        
        for(int i = 1;i<lst.size();i++){
            if(lst.get(i)-(lst.get(i-1)+1) < k) return false;
        }

        return true;
    }
}