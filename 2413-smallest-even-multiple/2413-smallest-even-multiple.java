class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0)
        {
            return (2*n)/2;
        }
        else if(n%2!=0)
        {
            return 2*n;
        }
        return 2*n;
    }
    
}