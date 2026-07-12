class Solution {
    public int[] applyOperations(int[] nums) {
        int left=0;
        for(int i=0;i<=nums.length-2;i++)
        {
            if(nums[i]==nums[i+1] && nums[i]!=0)
            {
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[left]=nums[i];
                left++;
            }
        }
        while(left<nums.length)
        {
            nums[left]=0;
            left++;
        }
        return nums;
    }
}