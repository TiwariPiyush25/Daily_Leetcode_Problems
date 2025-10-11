class Solution {
    public boolean isChar(char ch){
        if((ch>='a' &&  ch<='z') ||( ch>='A' && ch<='Z')) return true;
        return false;
    }
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(!isChar(arr[i])) i++;
            if(!isChar(arr[j])) j--;
            if(isChar(arr[i]) && isChar(arr[j])){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }   

        StringBuilder sb=new StringBuilder();
        for(char ch:arr) sb.append(ch);
        
        return sb.toString();
    }
}