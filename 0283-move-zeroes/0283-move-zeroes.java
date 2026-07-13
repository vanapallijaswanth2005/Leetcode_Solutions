class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int nums1[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                nums1[n-i-1]=0;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums1[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=nums1[i];
        }
        
    }
}