class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()>=8){
            boolean flag1=false; // check lowercase letter
            boolean flag2=false; // check Uppercase letter
            boolean flag3=false; // check digit letter
            boolean flag4=false; // check for special characters
            boolean flag5=true; // chaeck for adjacent same characters

            String specialchars="!@#$%^&*()-+";
            for(int i=0;i<password.length();i++){
                char ch=password.charAt(i);
                if(ch>='a' && ch<='z') flag1=true;
                if(ch>='A' && ch<='Z') flag2=true;
                if(ch>='0' && ch<='9') flag3=true;
                if(specialchars.indexOf(ch)!=-1) flag4=true;
            }

            for(int i=1;i<password.length();i++){
                char prev=password.charAt(i-1);
                char curr=password.charAt(i);

                if(prev==curr) flag5=false;
            }



            if(flag1 && flag2 && flag3 && flag4 && flag5){
                return true;
            }
            return false;
        }
        return false;
    }
}