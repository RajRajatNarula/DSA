import java.util.*;
class Solution
{
    public void median(int[] arr1,int[] arr2,int m,int n)
    {
        if(m<n)
        {
            median(arr2,arr1,n,m);
            return;
        }
        int low=0;
        int high=m;
        int medianpos=(m+n+1)/2;
        while(low<=high)
        {
            int cut1=(high+low)/2;
            int cut2=medianpos-cut1;
            
            int l1=(cut1==0)?Integer.MIN_VALUE:arr1[cut1-1];
            int l2=(cut2==0)?Integer.MIN_VALUE:arr2[cut2-1];
            int r1=(cut1==m)?Integer.MAX_VALUE:arr1[cut1];
            int r2=(cut2==n)?Integer.MAX_VALUE:arr2[cut2];
            
            if(l1<=r2 && l2<=r1)
            {
                if((m+n)%2==0)
                {
                    System.out.println((double)((Math.max(l1, l2)+Math.max(r1, r2)))/2.0);
                    return;
                }
                else
                {
                    System.out.println(Math.max(l1, l2));
                    return;
                }
            }
            
            else if(l1>r2)
            {
                high=cut1-1;
            }
            else
            {
                low=cut1+1;
            }
            
        }
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int arr1[] = {1,4,7,10,12};
        int arr2[] = {2,3,6,15};
        int m = arr1.length;
        int n = arr2.length;
        sol.median(arr1,arr2,m,n);
    }
}