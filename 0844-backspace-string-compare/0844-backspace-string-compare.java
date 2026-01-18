class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#' && !st1.isEmpty()){
                st1.pop();
            }
            else st1.push(ch);
        }

        Stack<Character> st2 = new Stack<>();
        for(char ch:t.toCharArray()){
            if(ch=='#' && !st2.isEmpty()){
                st2.pop();
            }
            else st2.push(ch);
        }

        String res1 = "";
        while(!st1.isEmpty()){
            res1 += st1.pop();
        }

        String res2 = "";
        while(!st2.isEmpty()) {
            res2 += st2.pop();
        }

        return res2.equals(res1);
    }
}