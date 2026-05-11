class Solution {
    public int[] scoreValidator(String[] events) {
        int counter = 0;
        int score = 0;

        for(int i=0;i<events.length;i++){
            if(events[i].equals("W")) counter++;
            else {
                if(events[i].equals("WD") || events[i].equals("NB")) score++;
                else score += Integer.parseInt(events[i]);
            };

            if(counter == 10) break;
        }

        return new int[]{score,counter};
    }
}