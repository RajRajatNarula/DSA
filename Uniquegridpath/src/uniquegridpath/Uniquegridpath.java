import java.util.*;
class Sol
{
    public static int pathcount(int i,int j,int m,int n)
    {
        if(i>=m || j>=n)
        {
            return 0;
        }
        if(i==m-1 && j==n-1)
        {
            return 1;
        }
        else
        {
            return pathcount(i+1,j,m,n)+pathcount(i,j+1,m,n);
        }
    }
    
    public static void main(String[] args)
    {
        int m=2,n=2;
        int res=pathcount(0,0,m,n);
        System.out.println("Count of Unique Paths To (M,N) is: "+res);
    }
}