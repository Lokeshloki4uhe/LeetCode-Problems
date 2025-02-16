//LEETCODE 1718. Construct the Lexicographically Largest Valid Sequence


class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] result = new int[2 * n - 1]; 
        boolean[] used = new boolean[n + 1]; 
        backtrack(result, used, n, 0);
        return result;
    }

    private boolean backtrack(int[] result, boolean[] used, int n, int pos) {
        if (pos == result.length) return true; 

        if (result[pos] != 0) return backtrack(result, used, n, pos + 1); 
        for (int i = n; i >= 1; i--) { 
            if (used[i]) continue; 

            if (i == 1) { 
                result[pos] = 1;
                used[1] = true;
                if (backtrack(result, used, n, pos + 1)) return true;
                result[pos] = 0;
                used[1] = false;
            } else if (pos + i < result.length && result[pos + i] == 0) {
                result[pos] = result[pos + i] = i;
                used[i] = true;
                if (backtrack(result, used, n, pos + 1)) return true;
                result[pos] = result[pos + i] = 0;
                used[i] = false;
            }
        }
        return false;
    }
}





