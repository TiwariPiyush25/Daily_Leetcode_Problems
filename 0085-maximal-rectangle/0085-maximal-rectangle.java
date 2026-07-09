class Solution {
    public int[] nse(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];

        for (int i=n-1;i>=0;i--){
            while (!st.isEmpty() && arr[i]<=arr[st.peek()]) st.pop();

            if (st.isEmpty()) ans[i]=n-1;
            else ans[i]=st.peek()-1;

            st.push(i);
        }

        return ans;
    }
    public int[] pse(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];

        for (int i=0;i<n;i++){
            while (!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();

            if (st.isEmpty()) ans[i]=0;
            else ans[i]=st.peek()+1;

            st.push(i);
        }

        return ans;
    }
    public int largestRectangleArea(int[] arr) {
        int[] nse=nse(arr);
        int[] pse=pse(arr);

        int maxArea=0;
        for (int i=0;i<arr.length;i++){
            int area=arr[i]*(nse[i]-pse[i]+1);
            maxArea=Math.max(maxArea,area);
        }

        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length , n = matrix[0].length;

        int[][] prefix = new int[m][n];
        for(int j = 0;j < n;j++){
            prefix[0][j] = (int) matrix[0][j] - '0';
        }


        for(int j = 0;j < n;j++){
            for(int i = 1;i  < m;i++){
                if(matrix[i][j] == '0') prefix[i][j] = 0;
                else prefix[i][j] = 1 + prefix[i-1][j];
            }
        }

        int maxArea = 0;
        for(int[] pref : prefix){
            int area = largestRectangleArea(pref);
            maxArea = Math.max(area , maxArea);
        }

        return maxArea;
    }
}