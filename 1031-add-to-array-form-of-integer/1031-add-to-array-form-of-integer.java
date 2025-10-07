class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans=new ArrayList<>();
        int n=num.length;
        int carry=0;
        for(int i=n-1;i>=0;i--){
            int v=num[i];
            
            int sum=v+(k%10)+carry;
            ans.add(0,sum%10);
            carry=sum/10;
            k/=10;
        }
        if(k>0){
            while(k>0){
                int sum=(k%10)+carry;
                k/=10;
                ans.add(0,sum%10);
                carry=sum/10;
            }
        }
        if(carry>0) ans.add(0,carry);
        return ans;
    }
}