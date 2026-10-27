class Solution {
public:
    int calculateScore(int a, int b) {
        int s1 = 0, s2 = 0;

        while(a >= 2){
            int rem = a % 2;
            if(rem == 1) s1++;
            a /= 2;
        }

        if(a == 1) s1++;

        while(b >= 2){
            int rem = b % 2;
            if(rem == 1) s2++;
            b /= 2;
        }

        if(b == 1) s2++;

        return (s1 >= s2) ? s1 * s2 : s2 / s1;
    }
};