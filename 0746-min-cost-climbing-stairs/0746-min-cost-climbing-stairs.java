class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int step1=0;
        int step2=0;
        int ans=0;
        for(int i=0;i<cost.length;i++)
        {
            ans=cost[i]+Math.min(step1,step2);
            step1=step2;
            step2=ans;
        }
        return Math.min(step1,step2);
    }
}