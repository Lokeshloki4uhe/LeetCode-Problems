//LEETCODE 1415. The k-th Lexicographical String of All Happy Strings of Length n


class Solution {
    public String getHappyString(int n, int k) {
        List<String> happyStrings = new ArrayList<>();
        backtrack(n, new StringBuilder(), happyStrings);
        return k <= happyStrings.size() ? happyStrings.get(k - 1) : "";
    }
    public void backtrack(int n, StringBuilder curr, List<String> happyStrings) {
        if (curr.length() == n) {
            happyStrings.add(curr.toString());
            return;
        }
        for (char ch : new char[]{'a', 'b', 'c'}) {
            if (curr.length() == 0 || curr.charAt(curr.length() - 1) != ch) {
                curr.append(ch);
                backtrack(n, curr, happyStrings);
                curr.deleteCharAt(curr.length() - 1);
            }
        }
    }
}








