//LEETCODE 29. Divide Two Integers

class Solution {
    public int divide(int dividend, int divisor) {
        int ans = dividend/divisor;
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        return ans;
    }
}