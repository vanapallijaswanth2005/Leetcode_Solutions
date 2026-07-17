class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        long maxsum=0;
        long sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(i-left+1>k)
            {
                hm.put(nums[left],hm.get(nums[left])-1);
                if(hm.get(nums[left])==0)
                {
                    hm.remove(nums[left]);
                }
                sum-=nums[left];
                left++;
            }
            if(i-left+1==k && hm.size()==k)
            {
                maxsum=Math.max(maxsum,sum);
            }
        }
        return maxsum; 
    }
}