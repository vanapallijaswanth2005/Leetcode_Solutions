class Solution {
    
     public int GCD(int a,int b)
        {
            while(b!=0)
            {
                int temp=a%b;
                a=b;
                b=temp;
            }
            return a;
        }
    public int minOperations(int[] nums, int[] numsDivide) {
        
        int res=numsDivide[0];
        for(int x:numsDivide)
        {
            res=GCD(res,x);
        }
       
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(res%nums[i]==0)
            {
                return i;
            }
        }

        return -1;

    }
}