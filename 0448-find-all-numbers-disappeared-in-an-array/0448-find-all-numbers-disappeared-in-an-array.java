class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hm=new HashSet<>();
        for(int num:nums)
        {
            hm.add(num);
        }
        ArrayList<Integer> Al=new ArrayList<>();
        for(int i=1;i<=nums.length;i++)
        {
            if(!hm.contains(i))
            {
                Al.add(i);
            }
        }
        return Al;
}
}