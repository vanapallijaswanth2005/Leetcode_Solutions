class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>>  hm=new HashMap<>();
        for(String s:strs)
        {
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String ans=new String(ch);
            if(hm.containsKey(ans))
            {
                hm.get(ans).add(s);  
            }
            else{
                List<String> l=new ArrayList<>();
                l.add(s);
                hm.put(ans,l);
            }
        }
        return new ArrayList<>(hm.values());    
    }
}