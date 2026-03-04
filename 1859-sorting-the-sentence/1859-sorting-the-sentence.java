class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        int n = arr.length;

        List<String> list = new ArrayList<>();
        for(int i = 0 ;i<n;i++) list.add("");

        for(String t:arr){
            String temp = t.substring(0,t.length()-1);
            int idx = ((int)t.charAt(t.length()-1) - '0');
            
            list.set(idx-1,temp);
        }

        String res = "";
        for(String t:list){
            res+=t;
            if(n-->1) res+=" ";
        }

        return res;
    }
}