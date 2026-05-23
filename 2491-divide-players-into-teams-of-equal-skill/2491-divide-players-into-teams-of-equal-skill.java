class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);

        int i = 0, j = skill.length - 1;

        int prevSum = 0;
        long totalchemistry = 0;
        while(i < j){
            int sum = skill[i] + skill[j]; 

            if(prevSum != 0 && sum != prevSum) return -1;
            else {
                prevSum = sum;
                totalchemistry += (skill[i] * skill[j]);
            }

            i++; j--;
        }

        return totalchemistry;
    }
}