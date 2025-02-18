//LEETCODE 2375. Construct Smallest Number From DI String


class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder ans = new StringBuilder();
        StringBuilder curr = new StringBuilder();
        for(int i = 0; i <= pattern.length(); i++) {
            curr.append((char) (i + '1'));
            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                ans.append(curr.reverse());
                curr.setLength(0);
            }
        }
        return ans.toString();
    }
}







