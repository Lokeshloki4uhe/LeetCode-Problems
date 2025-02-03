//LEETCODE 3105. Longest Strictly Increasing or Strictly Decreasing Subarray


class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLengthInc =1, maxLengthDec =1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                int a = getmaxInc(i,nums);
                maxLengthInc = Math.max(maxLengthInc,a);
            }
            else if (nums[i] > nums[i + 1]){
                int b = getmaxDec(i,nums);
                maxLengthDec = Math.max(maxLengthDec,b);
            }
        }
        return Math.max(maxLengthInc,maxLengthDec);
    }
    public int getmaxInc(int x,int[] nums){
            int count = 1;
            for(int i=x;i<nums.length-1;i++){
                if(nums[i] < nums[i+1]) count++;
                else break;
            }
            return count;
        }
        public int getmaxDec(int x,int[] nums){
            int count = 1;
            for(int i=x;i<nums.length-1;i++){
                if(nums[i] > nums[i+1]) count++;
                else break;
            }
            return count;
        }
}
