//LEETCODE 125. Valid Palindrome

class Solution {
    public boolean isPalindrome(String s) {
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0, j = cleanedString.length() - 1;
        while (i < j) {
            if (cleanedString.charAt(i) != cleanedString.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    }
