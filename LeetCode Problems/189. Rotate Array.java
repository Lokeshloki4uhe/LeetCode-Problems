//LEETCODE 189. Rotate Array

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int j=0;
        int[] temp = new int[k];
        for(int i = n-k;i<n;i++){
            temp[j] = nums[i];
            j++;
        }
        for(int i=n-1;i>=k;i--){
            nums[i] = nums[i-k];
        }
        for(int i=0;i<k;i++){
            nums[i] = temp[i];
        }
    }
}