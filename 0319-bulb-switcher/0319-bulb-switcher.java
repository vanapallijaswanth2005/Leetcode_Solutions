class Solution {
    public int bulbSwitch(int n) {
        // Logic :  The number of perfect sqaures upto n.. 

        int count=0; int i=1;
        while(i*i<=n)
        {
            count++;
            i++;
        }
        return count;
    }
}