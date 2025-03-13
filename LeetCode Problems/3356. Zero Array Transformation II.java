
//LEETCODE  3356. Zero Array Transformation II


class Solution {
    boolean isZeroArray(int[] nums,int[][] queries,int k)
    {
        int n =nums.length;
        int[] prefix = new int[n+1];
        for(int i=0;i<k;i++)
        {
            int l=queries[i][0];
            int r = queries[i][1];
            int val = queries[i][2];
            prefix[l] += val;
            if (r+1< n) {  
                prefix[r+1] -= val;
            }
        }
        for(int i=1;i<=n;i++)
        {
            prefix[i] += prefix[i-1];
        }
        for(int i=0;i<n;i++)
        {
            if(prefix[i]<nums[i]) return false;
        }
        return true;
    }
    public int minZeroArray(int[] nums, int[][] queries) {
        int low =0;
        int high = queries.length,n = queries.length;
        int ans = n+1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(isZeroArray(nums,queries,mid)){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        if(ans>n) return -1;
        return ans;
    }
}