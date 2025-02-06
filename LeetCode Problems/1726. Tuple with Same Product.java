//LEETCODE 1726. Tuple with Same Product


class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                map.put(product, map.getOrDefault(product, 0) + 1);
            }
        }
        int total = 0;
        for(int count : map.values()) {
            if(count >= 2) {
                total += (count * (count - 1)) / 2;
            }
        }
        return total * 8;
    }
}

