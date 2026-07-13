class Solution {
    public void helper(int x,int low,int high,HashSet<Integer> ans){
        if(x >= low && x <= high){
            ans.add(x);
        }
        if(x > high || x % 10 == 9 || x % 10 == 0) return;
        
        int nextdigit = (x % 10) + 1;
        int newVal = (x * 10) + nextdigit;

        helper(newVal,low,high,ans);
    }
    public boolean isPossible(int n){
        int prev = (n % 10) + 1;

        while(n > 0){
            int ld = n % 10;
            if(prev != ld + 1) return false;
            prev = ld;
            n /= 10;
        }

        return true;
    }
    public List<Integer> sequentialDigits(int low, int high) {
        int copy1 = low;
        int copy2 = high;
        int cnt = 0;
        while(copy1 > 9) {
            cnt++;
            copy1 /= 10;
        }
        while(copy2 > 9 && cnt-- > 0) copy2 /= 10;

        HashSet<Integer> temp= new HashSet<>();
        for(int i=copy1;i <= copy2;i++){
            if(isPossible(i)) helper(i,low,high,temp);
        }

        List<Integer> ans = new ArrayList<>();
        for(int ele : temp){
            ans.add(ele);
        }

        Collections.sort(ans);
        return ans;
    }
}