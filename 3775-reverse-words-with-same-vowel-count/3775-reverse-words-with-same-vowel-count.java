class Solution {
    public boolean isvowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') return true;
        return false;
    }
    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        int c = 0;
        for(int i = 0;i<arr[0].length();i++){
            if(isvowel(arr[0].charAt(i))) c++;
        }

        for(int i=1;i<arr.length;i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();

            int count = 0;
            for(int j = 0;j<arr[i].length();j++){
                if(isvowel(arr[i].charAt(j))) count++;
            }

            if(c==count) arr[i] = sb.toString();
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<arr.length;i++){
            sb.append(arr[i]);

            if(i!=arr.length-1) sb.append(" ");
        }

        return sb.toString();
    }
}