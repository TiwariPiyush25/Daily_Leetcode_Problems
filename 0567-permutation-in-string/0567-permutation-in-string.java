class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        
        int n=s1.length();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(int i=0;i<n;i++){
            char ch1=s1.charAt(i);
            if(map1.containsKey(ch1)){
                map1.put(ch1,map1.get(ch1)+1);
            }
            else map1.put(ch1,1);

            char ch2=s2.charAt(i);
            if(map2.containsKey(ch2)){
                map2.put(ch2,map2.get(ch2)+1);
            }
            else map2.put(ch2,1);
        }

        int st=0;
        int end=n;
        int size=n;

        while(end<s2.length()){
            if(map1.entrySet().equals(map2.entrySet())) return true;

            char ch2=s2.charAt(end);
            if(map2.containsKey(ch2)){
                map2.put(ch2,map2.get(ch2)+1);
            }
            else map2.put(ch2,1);

            
            int fre=map2.get(s2.charAt(st));
            if(fre==1) map2.remove(s2.charAt(st));
            else map2.put(s2.charAt(st),fre-1);

            st++;
            end++;
        }
        if(map1.entrySet().equals(map2.entrySet())) return true;
        
        return false;
    }
}