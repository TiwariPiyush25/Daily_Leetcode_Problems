class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] arr = text.split(" ");
        List<String> temp = new ArrayList<>();

        boolean flag1 = true; // for first string check
        boolean flag2 = true; // for second string check
        int i = 0;
        while(i < arr.length){
            if(arr[i].equals(first)){
                flag1 = false;
                if(i != arr.length - 1 && arr[i + 1].equals(second)){
                    flag2 = false;
                }

            }
            if(i < arr.length - 2 && !flag1 && !flag2){
                temp.add(arr[i+2]);
                flag1 = true; flag2 = true;
            }

            i++;
        }

        String[] ans = new String[temp.size()];
        for(i = 0;i < temp.size();i++){
            ans[i] = temp.get(i);
        }

        return ans;
    }
}