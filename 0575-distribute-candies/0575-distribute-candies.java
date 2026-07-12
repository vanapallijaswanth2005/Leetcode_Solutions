class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int num:candyType)
        {
            if(!hs.contains(num))
            {
                hs.add(num);
            }
        }
        return Math.min(hs.size(),n/2);
    }
}