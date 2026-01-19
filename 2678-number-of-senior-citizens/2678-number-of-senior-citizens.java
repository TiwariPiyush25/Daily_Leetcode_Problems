class Solution {
    public int countSeniors(String[] details) {
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for(String s:details){
            if(Integer.parseInt(s.substring(11,13)) > 60) count++;
            sb.setLength(0);
        }

        return count;
    }
}