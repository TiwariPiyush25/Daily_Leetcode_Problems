class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        while(n-->0){
            if(s.equals(goal)) return true;
            char ch=s.charAt(s.length()-1);
            String rem = s.substring(0,s.length()-1);

            s = ch+rem;
            System.out.println(s);
        }

        return false;
    }
}