class Solution {
    public static int rev(int x){
        int rev_x=0;
        while (x>0){
            rev_x = rev_x*10+(x%10);
            x/=10;
        }

        return rev_x;
    }
    public int countNicePairs(int[] arr) {
        long count=0;
        int n=arr.length;

        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<n;i++){
            int val=arr[i]-rev(arr[i]);
            if (map.containsKey(val)){
                int fre=map.get(val);
                count+=fre;

                map.put(val,fre+1);
            }
            else{
                map.put(val,1);
            }
        }

        count = count % ((int)Math.pow(10,9)+7);
        return (int) count;
    }
}