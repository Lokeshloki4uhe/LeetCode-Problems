485. Max Consecutive Ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current_count = 0;
        int max_count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                current_count++;
                max_count = Math.max(max_count, current_count);
            }
            else{
                current_count = 0;
            }
        }
        return max_count;
    }
}
