class Solution {
    public int countLargestGroup(int n) {
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 1;i <= n;i++){
            if(i < 10) {
                int f = map.getOrDefault(i , 0) + 1;
                max = Math.max(f , max);
                map.put(i ,f);
            }
            else {
                int sum = 0;

                int num = i;
                while(num > 0){
                    sum += (num%10);
                    num /= 10;
                }

                int f = map.getOrDefault(sum , 0) + 1;
                max = Math.max(f , max);
                map.put(sum, f);
            }
        }
        
        System.out.println(map);

        int count = 0;
        for(int key : map.keySet()){
            if(map.get(key) == max) count++;
        }

        return count;
    }
}