package HashMap;

import java.util.HashSet;
/*
    happy number means sqaure sum of digit till it beacome 1;

    example

    Input: n = 19
    Output: true
    Explanation:
    1*1 + 9*9 = 82
    8*8 + 2*2 = 68
    6*6 + 8*8 = 100
    1*1 + 0*0 + 0*0 = 1
*/

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=getNextDigit(n);
        }
        return n==1;
    }

    public int getNextDigit(int n){
        int totalSum=0;
        while(n>0){
            int digit = n%10;
            totalSum += digit*digit;
            n=n/10;
        }
        return totalSum;
    }
}
