class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<=9;i++)
        {
            findDigits(low,high,i-1,0,ans);
        }
        Collections.sort(ans);
        return ans;
    }

        public void findDigits(int low,int high,int prev,int num,List<Integer> ans)
        {
            if(num>=low && num<=high)
            {
                ans.add(num);

            }
            if(num>high)
            {
                return;
            }
            int next=prev+1;
            if(next<=9)
            {
                findDigits(low,high,next,num*10+next,ans);
                
            }

        }
    }
