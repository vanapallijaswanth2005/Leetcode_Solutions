class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int repeat=-1;
        for(int i:nums){
            if(!hs.contains(i))
            {
                hs.add(i);
            }
            else{
                repeat=i;
            }
        }
        int missing=-1;
        for(int i=1;i<nums.length+1;i++)
        {
            if(!hs.contains(i))
            {
                missing=i;
                break;
            }
        }
       return new int[]{repeat,missing};
    }
}