class Solution {
    public List<String> buildArray(int[] target, int n) {
        int idx=0;
        List<String> list = new ArrayList<>();
        
        int i = 1;
        while(i <= n && idx < target.length){
            if(i == target[idx]) {
                list.add("Push");
                idx++;
            }
            else {
                list.add("Push");
                list.add("Pop");
            }
            i++;
        }

        return list;
    }
}