class Solution {
    public void paths(int i,int[][] graph,List<List<Integer>> ans,List<Integer> list,boolean[] vis){
        if(i==graph.length-1){
            System.out.println(list);
            ans.add(new ArrayList<>(list));
            return;
        }

        vis[i] = true;
        for(int ele:graph[i]){
            if(!vis[ele]){
                vis[ele] = true;
                list.add(ele);
                paths(ele,graph,ans,list,vis);
                vis[ele] = false;
                list.remove(list.size()-1);
            }
        }

    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] vis = new boolean[graph.length];

        paths(0,graph,ans,new ArrayList<>(),vis);
        for(List<Integer> l:ans) l.add(0,0);
        return ans;
    }
}