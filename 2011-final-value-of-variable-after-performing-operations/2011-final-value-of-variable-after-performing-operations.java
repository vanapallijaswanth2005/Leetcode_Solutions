class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        for(String ans:operations)
        {
            if(ans.equals("--X"))
            {
                count--;
            }
            else if(ans.equals("X++"))
            {
                count++;
            }
            else if(ans.equals("X--"))
            {
                count--;
            }
            else{
                count++;
            }
        }
        return count;
    }
}