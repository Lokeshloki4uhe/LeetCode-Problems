//LEETCODE 1079. Letter Tile Possibilities


class Solution {
    public int numTilePossibilities(String tiles) {
        int len = tiles.length();
        boolean[] used = new boolean[len];
        HashSet<String> set = new HashSet<>();
        backtrack(tiles, used, set, "");
        return set.size() - 1;
    }
    private void backtrack(String tiles, boolean[] used, HashSet<String> set, String cur) {
        if (set.contains(cur)) return;
        set.add(cur);
        for (int i = 0; i < tiles.length(); i++) {
            if (used[i]) continue;
            used[i] = true;
            backtrack(tiles, used, set, cur + tiles.charAt(i));
            used[i] = false;
        }
    }
}






