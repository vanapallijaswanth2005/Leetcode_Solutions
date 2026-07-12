class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=nums.length-k;i++)
        {
            int mindiff=nums[i];
            int maxdiff=nums[i+k-1];
            int diff=maxdiff-mindiff;
            ans =Math.min(ans,diff);
        }
        return ans;
    }
}