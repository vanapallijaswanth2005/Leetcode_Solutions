class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
       int i=0;
       int j=nums.length-1;
       int n=nums.length;
       double minsum=Integer.MAX_VALUE;
       while(i<j)
       {
          int s=nums[i]+nums[j];
          if(s<minsum)
          {
            minsum=s;
          }
          i++;
          j--;
       }
       return minsum/2.0;
    }
}