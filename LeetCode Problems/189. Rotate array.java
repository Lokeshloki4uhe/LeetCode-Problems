//LEETCODE 189. Rotate Array

class Solution {
    public void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k % n;
    int[] temp = new int[n];
    for (int i = 0; i < k; i++) {
        temp[i] = nums[n - k + i];
    }
    for (int j = n - 1; j >= k; j--) {
        nums[j] = nums[j - k];
    }
    for (int x = 0; x < k; x++) {
        nums[x] = temp[x];
    }
}
}