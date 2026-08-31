class BrowserHistory {
    List<String> arr;
    int i = 0;
    public BrowserHistory(String homepage) {
        arr = new ArrayList<>();
        arr.add(homepage);
    }

    public void visit(String url) {
        i++;
        if (i < arr.size()) {
            arr.subList(i, arr.size()).clear();
        }
        arr.add(url);
    }
    
    public String back(int steps) {
        int size = arr.size();
        int idx = Math.max(0,i - steps);
        i = idx;
        return arr.get(i);
    }
    
    public String forward(int steps) {
        int size = arr.size();
        int idx = Math.min(i + steps,size - 1);
        i = idx;
        return arr.get(i);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */