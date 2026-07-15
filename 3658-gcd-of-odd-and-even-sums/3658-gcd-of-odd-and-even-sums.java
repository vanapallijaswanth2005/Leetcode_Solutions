class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=n*(n+1);
        int sumEven=n*n;
        while(sumEven!=0)
        {
            int rem=sumOdd%sumEven;
            sumOdd=sumEven;
            sumEven=rem;
        }
        return sumOdd;

    }
}