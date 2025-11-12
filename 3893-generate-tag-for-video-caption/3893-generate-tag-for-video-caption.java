class Solution {
    public String generateTag(String caption) {
        String res="#";
        String[] arr = caption.split(" ");
        if(arr.length==0) return res;
        boolean flag = true;

        for(int i=0;i<arr.length;i++){
            String s = arr[i];
            if(flag && s.length()>0){
                res += arr[i].toLowerCase();
                flag=false;
            }
            else if(s.length()>0){
                char ch=s.charAt(0);

                String left = (""+ ch).toUpperCase();
                String right = ""+s.substring(1).toLowerCase();
                res+= (left+right);
            }

            if(res.length()>=100) break;
        }
        int j = res.length();
        while(j>100) j--;

        res = res.substring(0,j);
        return res;
    }
}