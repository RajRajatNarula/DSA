import java.util.*;
class Solution
{
    public double multiply(double mid,int n)
    {
        double ans=1;
        for(int i=0;i<n;i++)
        {
            ans=ans*mid;
        }
        return ans;
    }
    public void nthroot(int n,int m)
    {
        double l=0;
        double h=m;
        double eps=1e-6;
        while((h-l)>eps)
        {
            double mid=(h+l)/2;
            if(multiply(mid,n)>m)
            {
                h=mid;
            }
            else
            {
                l=mid;
            }
        }
        System.out.println((l+h)/2);
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int n=3;
        int m=27;
        sol.nthroot(n,m);
    }
}