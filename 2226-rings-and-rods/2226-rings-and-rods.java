class Solution {
    public int countPoints(String rings) {
        String[] arr=new String[10];
        for(int i=0;i<10;i++) arr[i]="";

        int i=0;
        while(i<rings.length()){
            char Ring=rings.charAt(i);
            int idx=(int)(rings.charAt(i+1)-'0');

            if(arr[idx].indexOf(Ring)==-1){
                arr[idx]+=Ring;
            }
            i+=2;
        }

        int count=0;
        for(i=0;i<10;i++){
            if(arr[i].length()==3) count++;
        }

        return count;
    }
}