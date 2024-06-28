268.Missing Number

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i] != i){
                break;
            }
        }
        return i;
    }
}
