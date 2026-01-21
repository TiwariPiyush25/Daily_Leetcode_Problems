class Solution {
    public class pair implements Comparable<pair>{
        int id;
        int score;

        pair(int i,int s){
            this.id = i;
            this.score = s;
        }

        public int compareTo(pair p){
            if(this.score==p.score) return p.id - this.id; 
            return this.score - p.score;
        }
    }
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        HashSet<String> pos = new HashSet<>();
        for(String s:positive_feedback){
            pos.add(s);
        }

        HashSet<String> neg = new HashSet<>();
        for(String s:negative_feedback){
            neg.add(s);
        }
        PriorityQueue<pair> p = new PriorityQueue<>();
        for(int i=0;i<report.length;i++){
            String rep = report[i];
            int pf = 0;
            int nf = 0;
            for(String s:rep.split(" ")){
                if(pos.contains(s)) pf++;
                else if(neg.contains(s)) nf++;
            }

            int totalPoints = 0;
            totalPoints+=(3*pf);
            totalPoints-=(1*nf);

            p.add(new pair(student_id[i],totalPoints));
            if(p.size()>k) p.remove();
        }

        List<Integer> ans= new ArrayList<>();
        while(!p.isEmpty()){
            ans.add(0,p.remove().id);
        }

        return ans;
    }
}