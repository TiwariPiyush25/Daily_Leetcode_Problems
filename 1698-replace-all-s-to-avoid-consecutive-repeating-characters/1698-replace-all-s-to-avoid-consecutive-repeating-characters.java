class Solution {
    public String modifyString(String s) {
        if(s.length()==1 && s.charAt(0)=='?') return "a";

        char[] arr=s.toCharArray();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]=='?'){
                if(i==0){
                    char next=arr[1];
                    if(next=='?') next='a';

                    if(next=='a') arr[i]='b';
                    else if(next=='z') arr[i]='y';
                    else {
                        int ascii = (int)(next) + 1;
                        arr[i]=(char)(ascii);
                    }
                }
                else if(i==n-1){
                    char prev=arr[n-2];

                    if(prev=='?') prev='a';

                    if(prev=='a') arr[i]='b';
                    else if(prev=='z') arr[i]='y';
                    else {
                        int ascii = (int)(prev) + 1;
                        arr[i]=(char)(ascii);
                    }
                }
                else {
                    char next=arr[i+1];
                    char prev=arr[i-1];

                    for(char j='a';j<='z';j++){
                        if(j!=next && j!=prev){
                            arr[i]=j;
                            break;
                        }
                    }
                }

            }
        }

        StringBuilder sb=new StringBuilder();
        for(char ch:arr){
            sb.append(ch);
        }
        return sb.toString();
    }
}