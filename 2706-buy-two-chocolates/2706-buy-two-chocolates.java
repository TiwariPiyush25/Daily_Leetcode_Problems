class Solution {
    public int buyChoco(int[] prices, int money) {
        int cheapest = Integer.MAX_VALUE;
        int secondcheapest = Integer.MAX_VALUE;
        for(int ele:prices){
            if(ele<cheapest){
                secondcheapest = cheapest;
                cheapest = ele;
            }
            else if(ele < secondcheapest){
                secondcheapest = ele;
            }
        }

        if(secondcheapest + cheapest > money) return money;
        return money - (secondcheapest + cheapest);
    }
}