//LEETCODE 3066. Minimum Operations to Exceed Threshold Value II


class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (long num : nums) {
            pq.add(num);
        }
        int count = 0;
        while (pq.size() >= 2) {
            if (pq.peek() >= k) {
                return count;
            }
            count++;
            long x = pq.poll();
            long y = pq.poll();
            pq.add(x * 2 + y);
        }
        return count;
    }
}





