class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] arr, int st, int end) {
        Arrays.sort(arr , (a,b) -> (a[0] == b[0]) ? a[1] - b[1] : a[0] - b[0]);

        List<int[]> temp = new ArrayList<>();
        int[] a = new int[]{arr[0][0],arr[0][1]};
        temp.add(a);

        for(int i = 1;i < arr.length;i++) {
            int prevs = temp.get(temp.size()-1)[0];
            int preve = temp.get(temp.size()-1)[1];

            if(preve >= arr[i][0] || preve == arr[i][0] - 1){ // OverLap
                temp.get(temp.size()-1)[0] = Math.min(arr[i][0],prevs);
                temp.get(temp.size()-1)[1] = Math.max(arr[i][1],preve);
            }
            else {
                int[] x = new int[]{arr[i][0],arr[i][1]};
                temp.add(x);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(int[] x : temp){
            int s = x[0] , e = x[1];

            if(s >= st && e <= end) continue;
            else if(st >= s && end <= e){
                if(s <= st-1){
                    List<Integer> dummy1 = new ArrayList<>();
                    dummy1.add(s);
                    dummy1.add(st-1);
                    ans.add(dummy1);
                }

                if(e >= end + 1){
                    List<Integer> dummy2 = new ArrayList<>();
                    dummy2.add(end+1);
                    dummy2.add(e);
                    ans.add(dummy2);    
                }

                continue;
            }
            else if(s >= st){
                s = Math.max(end + 1, s);
                e = Math.max(e , end);
            }
            else if(e >= st){
                e = st - 1;
            }
            List<Integer> dummy = new ArrayList<>();
            dummy.add(s);
            dummy.add(e);
            ans.add(dummy);
        }

        
        return ans;
    }
}