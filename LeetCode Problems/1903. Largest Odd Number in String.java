//LEETCODE 1903. Largest Odd Number in String  

class Solution {
    public String largestOddNumber(String num) {
        int i;
        for(i=num.length()-1;i>=0;i--){
            if(num.charAt(i)%2==1)
            break;
        }
        return num.substring(0,i+1);
    }
}
