class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        
        StringBuilder sb=new StringBuilder();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i].length()>0){
                sb.append(arr[i]);
                if(i!=0) sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}