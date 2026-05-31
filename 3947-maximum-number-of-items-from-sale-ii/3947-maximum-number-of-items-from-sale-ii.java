class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length, minP = Integer.MAX_VALUE;

        int maxFactor = 0;
        for(int[] item : items){
            maxFactor = Math.max(item[0] , maxFactor);
            minP = Math.min(item[1] , minP);
        }

        int[] freq = new int[maxFactor + 1];
        for(int[] item : items){
            freq[item[0]]++;
        }

        int[] freeCopies = new int[maxFactor + 1];
        for(int i = 1;i <= maxFactor;i++){
            if(freq[i] == 0) continue;
            for(int j = i;j <= maxFactor;j+= i){
                freeCopies[i] += freq[j];
            }
        }

        List<int[]> arr = new ArrayList<>();
        for(int[] item : items) {
            int factor = item[0], price = item[1];
            int freeCopy = freeCopies[factor] - 1;

            if(freeCopy > 0 && price < 2 * minP) arr.add(new int[]{price , freeCopy});
        }

        Collections.sort(arr , (a , b) -> a[0] - b[0]);
        int ans = 0, leftBudget = budget;
        for(int[] a: arr){
            int take = Math.min(a[1] , leftBudget / a[0]);
            ans += (2 * take);
            leftBudget -= (take * a[0]);
            
            if(take < a[1]) break;
        }

        ans += leftBudget / minP;

        return ans;
    }
}