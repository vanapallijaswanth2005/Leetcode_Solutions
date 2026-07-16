class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int res=0;
        int i=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int j=0;j<n;j++)
        {
            char c=s.charAt(j);
            hm.put(c,hm.getOrDefault(c,0)+1);
            while(hm.get(c)>2)
            {
                char left=s.charAt(i);
                hm.put(left,hm.get(left)-1);
                i++;
            }
            res=Math.max(res,j-i+1);
        }
        return res;
    }
}