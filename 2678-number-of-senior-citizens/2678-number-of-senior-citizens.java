class Solution {
    public int countSeniors(String[] details) {
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for(String s:details){
            sb.append(s.charAt(11));
            sb.append(s.charAt(12));

            if(Integer.parseInt(sb.toString()) > 60) count++;
            sb.setLength(0);
        }

        return count;
    }
}