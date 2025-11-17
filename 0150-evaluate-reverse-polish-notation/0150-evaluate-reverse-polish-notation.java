class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> val=new Stack<>();

        for (String t:tokens) {

            if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
                int b=val.pop();
                int a=val.pop();
                int res=0;

                switch(t){
                    case "+":res=a+b; break;
                    case "-":res=a-b; break;
                    case "*":res=a*b; break;
                    case "/":res=a/b; break;
                }
                val.push(res);
            }
            else{
                val.push(Integer.parseInt(t));
            }
        }

        return val.pop();
    }
}