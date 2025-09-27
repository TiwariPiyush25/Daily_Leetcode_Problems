class Solution {
    public int maximumProduct(int[] arr) {
        int n=arr.length;

        int min=Integer.MAX_VALUE;
        int s_min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int s_max=Integer.MIN_VALUE;
        int t_max=Integer.MIN_VALUE;

        for(int ele:arr){
            if(ele>max){
                t_max=s_max;
                s_max=max;
                max=ele;
            }
            else if(ele>s_max){
                t_max=s_max;
                s_max=ele;
            }
            else if(ele>t_max){
                t_max=ele;
            }

            if(ele<min){
                s_min=min;
                min=ele;
            }
            else if(ele<s_min){
                s_min=ele;
            }
        }

        int p1=min*s_min*max;
        int p2=max*s_max*t_max;

        return p1>p2 ? p1 : p2;
    }
}