class Solution {
    public int numberOfBeams(String[] bank) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(String s:bank){
            int count = 0;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)=='1') count++;
            }

            if(count>0) arr.add(count);
        }

        if(arr.size()==0) return 0;
        int total = 0;
        for(int i = 0 ;i< arr.size() - 1;i++){
            int prev = arr.get(i);
            int next = arr.get(i+1);

            total += prev * next;
        }

        return total;
    }
}