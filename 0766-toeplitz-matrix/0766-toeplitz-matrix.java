class Solution {
    public boolean validFun(int[][] matrix,int i,int j)
     {
        int r=matrix.length;
        int c=matrix[0].length;
        int temp=matrix[i][j];
        i++;
        j++;
        while(i<r && j<c  ){
            if(matrix[i][j]!=temp)
            {
                return false;
            }
            i++;
            j++;
        }
        
        return true;

    }
    public boolean isToeplitzMatrix(int[][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        boolean ans=true;
        for(int j=0;j<c;j++)
        {
            boolean temp=validFun(matrix,0,j);
            if(temp==false){
                ans=false;
            }
        }
        for(int i=1;i<r;i++)
        {
            boolean temp=validFun(matrix,i,0);
            if(!temp){
                ans=false;
    }
}
return ans;
    }
}