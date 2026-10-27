class Solution {
public:
    int noOfSetBits(int x){
        int cnt = 0;
        while(x >= 2){
            if(x % 2 == 1) cnt++;
            x /= 2;
        }
        if(x == 1) cnt++;

        return cnt;
    }
    int calculateScore(int a, int b) {
        int s1 = noOfSetBits(a);
        int s2 = noOfSetBits(b);

        return (s1 >= s2) ? s1 * s2 : s2 / s1;
    }
};