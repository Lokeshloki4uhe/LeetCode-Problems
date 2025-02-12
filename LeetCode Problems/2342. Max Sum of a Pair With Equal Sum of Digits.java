//LEETCODE 2342. Max Sum of a Pair With Equal Sum of Digits


class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = -1;

        for (int num : nums) {
            int sum = getSum(num);
            if (map.containsKey(sum)) {
                ans = Math.max(ans, num + map.get(sum));
                map.put(sum, Math.max(map.get(sum), num));
            } else {
                map.put(sum, num);
            }
        }
        return ans;
    }

    private int getSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}




