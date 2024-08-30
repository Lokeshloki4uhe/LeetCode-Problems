//LEETCODE 26. Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int i=0;
        for(int element:set){
            nums[i]=element;
            i++;
        }
        return set.size();
    }
}