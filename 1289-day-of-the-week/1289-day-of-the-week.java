class Solution {
    public String DayCode(int n){
        if(n==0) return "Saturday";
        if(n==1) return "Sunday";
        if(n==2) return "Monday";
        if(n==3) return "Tuesday";
        if(n==4) return "Wednesday";
        if(n==5) return "Thursday";
        return "Friday";
    }
    public int MonthCode(int n,boolean leap){
        if(!leap && n==1) return 1;
        if(leap && n==1) return 0;
        if(!leap && n==2) return 4;
        if(leap && n==2) return 3;
        if(!leap && n==3) return 4;
        if(leap && n==3) return 3;
        if(n==4) return 0;
        if(n==5) return 2;
        if(n==6) return 5;
        if(n==7) return 0;
        if(n==8) return 3;
        if(n==9) return 6;
        if(n==10) return 1;
        if(n==11) return 4;
        return 6;
    }
    public int yearcode(int n){
        if(n==0) return 6;
        if(n==100) return 4;
        if(n==200) return 2;
        return 0;
    }
    
    public String dayOfTheWeek(int day, int month, int year) {
        boolean leap=false;
        if(year%4==0 && (year%100!=0 || year%400==0)) leap=true;

        int sum=(day + MonthCode(month,leap) + (year%100) + yearcode((year-(year%100))%400) + (year%100)/4);

        int rem=sum%7;
        System.out.println(rem);
        return DayCode(rem);
    }
}