//LEETCODE 11. Container With Most Water

class Solution {
    public int maxArea(int[] height) {
        int first = 0;
        int last = height.length-1;
        int area = 0;
        int max_area = 0;
        while(first<last){
            int width = last-first;
            int length = Math.min(height[first],height[last]);
            area = width*length;
            max_area = Math.max(max_area,area);
            if(height[first]<height[last]) first++;
            else last--;
        }
        return max_area;
    }
}