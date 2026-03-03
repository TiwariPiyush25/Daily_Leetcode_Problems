class Solution {
    public String convert(String s, int n) {
        if(n==1) return s;
        
        String[] arr = new String[n];
        Arrays.fill(arr,"");

        int i=0;
        int row = 0;
        while(i<s.length()){
            while(i<s.length() && row<n){
                arr[row] +=s.charAt(i);
                i++; row++;
            }
            row = n-2;

            while(i<s.length() && row>=0){
                arr[row] += s.charAt(i);
                i++; row--;
            }
            row = 1;
        }

        StringBuilder sb = new StringBuilder();
        for(String str:arr){
            sb.append(str);
        }

        return sb.toString();
    }
}