import java.util.*;
class Solution
{
    public void search(int[] arr,int target)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                System.out.println(mid);
                return;
            }
            if(arr[low]<=arr[mid])
            {
                if(arr[low]<=target && arr[mid]>=target)
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else
            {
                if(arr[mid]<=target && arr[high]>=target)
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        sol.search(arr,target);
        
    }
}