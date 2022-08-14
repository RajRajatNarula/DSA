import java.util.*;
class Solution
{
    public void single(int[] arr,int n)
    {
        int low=0;
        int high=n-2;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(mid%2==0)
            {
                if(arr[mid]==arr[mid+1])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
            else
            {
                if(arr[mid]==arr[mid+1])
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
        }
        System.out.println(arr[low]);
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int[] arr={1,1,2,3,3,4,4,5,5};
        int n=arr.length;
        sol.single(arr,n);
        
    }
}