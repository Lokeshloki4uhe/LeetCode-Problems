class Solution {
    public int numOfSubarrays(int[] arr) {
        
        int mod = (int) (1e9+7);
        int ans=0;
        int pfsum=0;
        int oddsum=0;
        int evensum=1;

        for(int num:arr){
            pfsum+=num;
            if((pfsum&1)==0){
                evensum++;
                ans+=oddsum;
            }
            else{
                oddsum++;
                ans+=evensum;
            }
            ans%=mod;
        }
        return ans;
    }
}