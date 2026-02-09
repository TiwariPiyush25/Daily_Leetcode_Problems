class Solution {
    public int singleNumber(int[] nums) {
       int[] arr = new int[32];

       int res = 0; 
       for(int bit=0;bit<32;bit++){
            int count =  0;
            
            for(int ele:nums){
                if((ele & (1<<bit))!= 0) count++;
            }

            if(count % 3 != 0){
                res = res | (1 << bit);
            }
        }

       return res;
    }
}