class Solution {
    public int Min(int f1,int f2,int f3,int f4,int f5){
        return Math.min(f1,Math.min(f2,Math.min(f3,Math.min(f4,f5))));
    }
    public int maxNumberOfBalloons(String text) {
        if(text.length()<7) return 0;
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else map.put(ch,1);
        }

        // fre of b
        int f1=0;
        if(map.containsKey('b')) f1=map.get('b');

        // fre of a
        int f2=0;
        if(map.containsKey('a')) f2=map.get('a');

        // fre of l
        int f3=0;
        if(map.containsKey('l')) f3=map.get('l');

        // fre of o
        int f4=0;
        if(map.containsKey('o')) f4=map.get('o');

        // fre of n
        int f5=0;
        if(map.containsKey('n')) f5=map.get('n');

        int min=Min(f1,f2,f3/2,f4/2,f5);

        return min;
    }
}