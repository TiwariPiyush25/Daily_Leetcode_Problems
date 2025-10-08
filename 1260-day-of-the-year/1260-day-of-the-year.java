class Solution {
    public int days(int M,boolean leap){
        if(M==1 || M==3 || M==5 || M==7 || M==8 || M==10 || M==12) return 31;
        if(leap==false && M==2) return 28;
        if(leap==true && M==2) return 29;
        return 30;
    }
    public int dayOfYear(String date) {
        int y=Integer.parseInt(date.substring(0,4));
        int M=Integer.parseInt(date.substring(5,7));
        int d=Integer.parseInt(date.substring(8));

        boolean leap=false;
        if(y%4==0 && (y%100!=0 || y%400==0)) leap=true;
        
        
        int totaldays=0;
        for(int i=1;i<M;i++){
            totaldays+=days(i,leap);
        }

        totaldays+=d;

        return totaldays;
    }
}