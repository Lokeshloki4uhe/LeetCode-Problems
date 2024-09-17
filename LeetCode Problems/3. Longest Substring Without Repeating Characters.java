//LEETCODE 3. Longest Substring Without Repeating Characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> Map = new HashMap<>();
        int left = 0, maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (Map.containsKey(ch)) {
                left = Math.max(Map.get(ch) + 1, left);
            }
            Map.put(ch, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}