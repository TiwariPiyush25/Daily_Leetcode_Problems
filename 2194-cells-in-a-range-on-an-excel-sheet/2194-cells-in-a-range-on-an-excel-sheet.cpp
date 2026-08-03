class Solution {
public:
    vector<string> cellsInRange(string s) {
        vector<string> ans;

        char c1 = s[0];
        int n1 = (int) s[1] - '0';
        char c2 = s[3];
        int n2 = (int) s[4] - '0';

        for(char ch = c1;ch <= c2; ch++){
            for(int i = n1;i <= n2;i++){
                string t = "";
                t.push_back(ch);
                t.push_back(i+'0');

                ans.push_back(t);
            }
        }

        return ans;
    }
};