class Solution {
    public int rob(int[] nums) {
        int house1=0;
        int house2=0; int ans=0;
        for(int i=0;i<nums.length;i++)
        {
             ans=Math.max(house1+nums[i],house2);
            house1=house2;
            house2=ans;
        }
        return ans;
        
    }
}