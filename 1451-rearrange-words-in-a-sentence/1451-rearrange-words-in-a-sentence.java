class Solution {
    public class triplet implements Comparable<triplet>{
        String word;
        int len;
        int pos;

        triplet(String s,int l,int p){
            this.word = s;
            this.len = l;
            this.pos = p;
        }

        public int compareTo(triplet t){
            if(this.len == t.len) return this.pos - t.pos;
            return this.len - t.len;
        }
    }
    public String arrangeWords(String text) {
        String[] arr = text.split(" ");

        PriorityQueue<triplet> heap = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            heap.add(new triplet(arr[i],arr[i].length(),i));
        }

        StringBuilder sb = new StringBuilder();

        while(!heap.isEmpty()){
            triplet t = heap.remove();

            sb.append(t.word.toLowerCase());
            if(!heap.isEmpty()) sb.append(" ");
        }

        sb.setCharAt(0,(char)((int)sb.charAt(0) - 32));
        return sb.toString();
    }
}