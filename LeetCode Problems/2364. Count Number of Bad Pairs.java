//LEETCODE 2364. Count Number of Bad Pairs


class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        long totalPairs = (long) nums.length * (nums.length - 1) / 2;
        long goodPairs = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i] - i;
            goodPairs += freq.getOrDefault(value, 0);
            freq.put(value, freq.getOrDefault(value, 0) + 1);
        }
        
        return totalPairs - goodPairs;
    }
}


