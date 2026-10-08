class Solution {
public:
    string removeOuterParentheses(string s) {
        int open = 0 , close = 0;

        string sb;
        int l = 0;
        for(int i = 0;i < s.length();i++){
            char ch = s[i];

            if(ch == '(') open++; 
            else close++;
        
            if(open == close){
                open = 0; close = 0;
                int len = i - l - 1;
                sb += s.substr(l+1,len);
                l = i + 1;
            }
        }

        return sb;
    }
};