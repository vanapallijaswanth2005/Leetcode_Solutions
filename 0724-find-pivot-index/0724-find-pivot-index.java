class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int total=0;
        int lefttotal=0;
        for(int num:nums)
        {
            total+=num;
        }
        for(int i=0;i<n;i++)
        {
            int righttotal=total-nums[i]-lefttotal;
            if(righttotal==lefttotal)
            {
                return i;
            }
            lefttotal+=nums[i];

        }
        return -1;
    }
}