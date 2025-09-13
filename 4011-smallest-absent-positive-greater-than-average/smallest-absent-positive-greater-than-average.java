class Solution {
    public int smallestAbsent(int[] arr) {
        int sum=0;

        ArrayList<Integer> temp=new ArrayList<>();
        for(int ele:arr){
            sum+=ele;
            temp.add(ele);
        }

        int avg=sum/arr.length;

        int i=avg;
        while(true){
            if(i>0 && i>avg && !temp.contains(i)) break;
            i++;
        }

        return i;
    }
}