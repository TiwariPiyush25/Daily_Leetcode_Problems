class Solution {
    public int[] findEvenNumbers(int[] digits) {
         HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:digits){
            if (map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        for (int num=100;num<=999;num++){
            if (num%2==0){
                int x=num;
                int c=x%10; x/=10;
                int b=x%10; x/=10;
                int a=x;


                if (map.containsKey(a)){
                    int a_count=map.get(a);
                    if (a_count==1) map.remove(a);
                    else map.put(a,a_count-1);

                    if (map.containsKey(b)){
                        int b_count=map.get(b);
                        if (b_count==1) map.remove(b);
                        else map.put(b,b_count-1);

                        if (map.containsKey(c)){
                            ans.add(num);
                        }
                        map.put(b,b_count);
                    }

                    map.put(a,a_count);
                }
            }
        }

        int[] resultant=new int[ans.size()];
        int idx=0;
        for (int i:ans){
            resultant[idx++]=i;
        }

        return resultant;
    }
}