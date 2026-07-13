class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r)
        {
            
            int h=Math.min(height[l],height[r]);
            int length=r-l;
            int area=h*length;
            max=Math.max(max,area);
            if(height[l]<height[r])
           {
             l=l+1;
           }
           else
           {
            r=r-1;
           }

        }
        return max;

    }
}