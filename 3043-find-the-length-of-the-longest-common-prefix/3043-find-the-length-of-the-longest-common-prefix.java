class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        List<String> A = new ArrayList<>();
        List<String> B = new ArrayList<>();
        for(int i = 0;i < arr1.length;i++){
            A.add(""+arr1[i]); 
        }

        for(int i = 0;i < arr2.length;i++){
            B.add(""+arr2[i]); 
        }

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        for(int i = 0;i < A.size();i++){
            String a = "";
            for(int j = 0;j<A.get(i).length();j++){
                a += A.get(i).charAt(j);

                set1.add(a);
            }
        }

        for(int i = 0;i < B.size();i++){
            String a = "";
            for(int j = 0;j<B.get(i).length();j++){
                a += B.get(i).charAt(j);

                set2.add(a);
            }
        }

        int maxLen = 0;
        for(String s : set2){
            if(set1.contains(s)){
                int len = s.length();
                maxLen = Math.max(maxLen , len);
            }
        }

        return maxLen;
    }
}