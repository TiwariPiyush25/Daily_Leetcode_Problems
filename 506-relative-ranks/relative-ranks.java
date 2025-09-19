class Solution {
    public class pair implements Comparable<pair>{
        int ele;
        int idx;

        pair(int ele , int idx){
            this.ele=ele;
            this.idx=idx;
        }

        public int compareTo(pair t){
            return this.ele - t.ele;
        }
    }
    public String getrank(int rank){
        if(rank==1) return "Gold Medal";
        if(rank==2) return "Silver Medal";
        if(rank==3) return "Bronze Medal";

        return ""+rank;
    }
    public String[] findRelativeRanks(int[] score) {
        int top=3;
        String[] ans=new String[score.length];

        PriorityQueue<pair> p=new PriorityQueue<>();

        for(int i=0;i<score.length;i++){
            p.add(new pair(score[i],i));
        }

        while(!p.isEmpty()){
            String val=""+getrank(p.size());
            pair temp=p.remove();
            ans[temp.idx]=val;
        }

        return ans;
    }
}