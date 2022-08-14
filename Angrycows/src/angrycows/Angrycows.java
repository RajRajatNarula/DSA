import java.util.*;
class Solution
{
    
    public boolean ispossible(int[] arr,int n,int mindistance,int cows)
    {
        int lastplacedcow=arr[0];
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]-lastplacedcow>=mindistance)
            {
                count+=1;
                lastplacedcow=arr[i];
            }
            
        }
        if(count>=cows)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void angrycows(int[] arr,int n,int cows)
    {
        Arrays.sort(arr);
        int low=1;
        int high=arr[n-1]-arr[0];
        int res=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(ispossible(arr,n,mid,cows))
            {
                res=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        System.out.println(res);
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int[] arr={1,2,4,8,9};
        int n=arr.length;
        int cows=3;
        sol.angrycows(arr,n,cows);
    }
}