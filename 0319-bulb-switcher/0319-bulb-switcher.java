class Solution {
    public int bulbSwitch(int n) {
        // Logic :  The number of perfect sqaures upto n.. 

        int count=0;
        boolean ans=false;
        for(int i=1;i<=n;i++)
        {
            int per_squ=(int) Math.sqrt(i);
            if(per_squ*per_squ==i)
            {
                ans=true;
                count+=1;
            }
        }
        return count;
    }
}