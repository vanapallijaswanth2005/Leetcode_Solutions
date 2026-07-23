class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(0, target, candidates, new ArrayList<>(), ans);

        return ans;
    }

    public void backtrack(int index,
                          int target,
                          int[] arr,
                          List<Integer> ds,
                          List<List<Integer>> ans)
    {

        if(target == 0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index;i<arr.length;i++)
        {

            // Skip duplicates
            if(i>index && arr[i]==arr[i-1])
                continue;

            // Since array is sorted
            if(arr[i]>target)
                break;

            ds.add(arr[i]);

            // Move to next index
            backtrack(i+1,target-arr[i],arr,ds,ans);

            ds.remove(ds.size()-1);
        }
    }
}