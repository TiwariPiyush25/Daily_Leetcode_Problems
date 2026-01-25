class Solution {
    public String decodeMessage(String key, String message) {
        List<Character> arr = new ArrayList<>();

        for(int i=0;i<key.length();i++){
            char ch = key.charAt(i);
            if(ch!=' ' && !arr.contains(ch)) arr.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<message.length();i++){
            char ch = message.charAt(i);
            if(ch==' ') sb.append(' ');
            else{
                int index = arr.indexOf(ch);
                char newchar = (char)(index + 97);
                sb.append(newchar);
            }
        }

        return sb.toString();
    }
}