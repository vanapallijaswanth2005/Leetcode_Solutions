class Solution {
    public boolean isPalindrome(String s1)
    {
        int l=0;
        int r=s1.length()-1;
        while(l<r)
        {
            if(s1.charAt(l)!=s1.charAt(r))
            {
                return false;
            }
            else{
                l++;r--;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
              String subs=s.substring(i,j+1);
              if(isPalindrome(subs) && subs.length()>ans.length())
              {
                ans=subs;
              }
            }
        }
        return ans;
    }
    
}