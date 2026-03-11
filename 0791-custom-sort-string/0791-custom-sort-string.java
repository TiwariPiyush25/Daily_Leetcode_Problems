class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<order.length();i++){
            if(map.containsKey(order.charAt(i))){
                int cnt = map.get(order.charAt(i));
                System.out.println(order.charAt(i) + " " + cnt);
                while(cnt-- > 0){
                    sb.append(order.charAt(i));
                }

                map.remove(order.charAt(i));
            }
        }

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))) sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}