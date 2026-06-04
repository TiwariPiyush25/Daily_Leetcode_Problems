class Spreadsheet {
    HashMap<String,Integer> map;
    public boolean isValid(String s){
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') return false;
            i++;
        }

        return true;
    }
    public Spreadsheet(int rows) {
        map = new HashMap<>();
    }
    
    public void setCell(String cell, int value) {
        map.put(cell , value);
    }
    
    public void resetCell(String cell) {
        map.put(cell , 0);
    }
    
    public int getValue(String formula) {
        int idx = formula.indexOf("+");
        String x = formula.substring(1,idx);
        String y = formula.substring(idx+1);

        boolean flag1 = isValid(x);
        boolean flag2 = isValid(y);

        int v1 = 0; int v2 = 0;
        if(map.containsKey(x)){
            v1 = map.get(x);
        }   
        else if(flag1){
            v1 = Integer.valueOf(x);
        }

        if(map.containsKey(y)){
            v2 = map.get(y);
        }   
        else if(flag2){
            v2 = Integer.valueOf(y);
        }

        return v1 + v2;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */