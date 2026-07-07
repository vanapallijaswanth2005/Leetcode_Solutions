class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        
        long sum = 0;
        
        int div = 1;
        while (n / div >= 10) {
            div *= 10;
        }
        
        while (div > 0) {
            int digit = n / div;
            
            n %= div;
            
            if (digit != 0) {
                x = x * 10 + digit;
                
                sum += digit;
            }
            
            div /= 10;
        }
        
        return x * sum;
    }
}