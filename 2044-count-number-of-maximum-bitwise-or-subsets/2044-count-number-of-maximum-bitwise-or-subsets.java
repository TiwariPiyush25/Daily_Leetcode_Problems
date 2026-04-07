class Solution {
    public int helper(int i,int[] arr,HashMap<Integer,Integer> dp){
        if(i == arr.length){
            return 0;
        }
        if(dp.containsKey(i)) return dp.get(i);
        int take = arr[i] | helper(i+1,arr,dp);
        int skip = helper(i+1,arr,dp);

        int x = Math.max(take,skip);
        dp.put(i,x);
        return x;
    }
    public int find(int i,int or,int[] arr,int t,HashMap<String,Integer> dp){
        if(i == arr.length){
            if(or == t) return 1;
            return 0;
        }
        String s = i + "," + or;
        if(dp.containsKey(s)) return dp.get(s);
        int take = find(i+1,or | arr[i],arr,t,dp);
        int skip = find(i+1,or,arr,t,dp);

        int x = take + skip;
        dp.put(s,x);
        return x;
    }
    public int countMaxOrSubsets(int[] nums) {
        HashMap<Integer,Integer> dp = new HashMap<>();
        int maxOr = helper(0,nums,dp);
        
        System.out.println(maxOr);
        HashMap<String,Integer> dp2 = new HashMap<>();
        int cnt = find(0,0,nums,maxOr,dp2);

        return cnt;
    }
}