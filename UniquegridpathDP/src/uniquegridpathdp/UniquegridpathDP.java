import java.util.*;
class Sol
{
    public static int pathcount(int i,int j,int m,int n,int[][] dp)
    {
        if(i>=m || j>=n)
        {
            return 0;
        }
        
        if(i==m-1 && j==n-1)
        {
            return 1;
        }
        
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        else
        {
            return dp[i][j]=pathcount(i+1,j,m,n,dp)+pathcount(i,j+1,m,n,dp);
        }
        
    }
    
    public static void main(String[] args)
    {
        int m=2,n=2;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int res=pathcount(0,0,m,n,dp);
        System.out.println(res);
        
    }
    
}