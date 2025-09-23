class Solution {
    public int maxProductDifference(int[] arr) {
        int max=Integer.MIN_VALUE;
        int s_max=Integer.MIN_VALUE;

        for(int ele:arr){
            if(ele>max){
                s_max=max;
                max=ele;
            }
            else if(ele>s_max){
                s_max=ele;
            }
        }

        int min=Integer.MAX_VALUE;
        int s_min=Integer.MAX_VALUE;

        for(int ele:arr){
            if(ele<min){
                s_min=min;
                min=ele;
            }
            else if(ele<s_min){
                s_min=ele;
            }
        }


        return max*s_max-min*s_min;
    }
}