class StockSpanner {
    Stack<Integer> st;
    ArrayList<Integer> arr;
    ArrayList<Integer> ans;
    public StockSpanner() {
        arr = new ArrayList<>();
        ans = new ArrayList<>();
        st = new Stack<>();
    }
    
    public int next(int price) {
        arr.add(price);
        while (!st.isEmpty() && arr.get(arr.size()-1)>=arr.get(st.peek())){
            st.pop();
        }

        if (st.isEmpty()){
            ans.add(arr.size());
            st.push(arr.size() - 1);
            return ans.get(ans.size()-1);
        }
        else {
            ans.add(arr.size() - st.peek() - 1);
            st.push(arr.size() - 1);
            return ans.get(ans.size()-1);
        }
    }
}