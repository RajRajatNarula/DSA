import java.util.*;
class Solution
{
    public int smallercount(int[] num,int mid)
    {
        int low=0;
        int high=num.length-1;
        while(low<=high)
        {
            int m=(high+low)/2;
            if(num[m]<=mid)
            {
                low=m+1;
            }
            else
            {
                high=m-1;
            }
        }
        return low;
    }
    
    public void matrixmedian(int[][] arr)
    {
        int low=1;
        int high=(int) 1e9;
        
        int n=arr.length;
        int m=arr[0].length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int count=0;
            for(int i=0;i<n;i++)
            {
                count+=smallercount(arr[i],mid);
            }
            
            if(count<=((n*m)/2))
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        System.out.println(low);
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int[][] arr={{1,3,6},{1,6,9},{3,6,9}};
        sol.matrixmedian(arr);
    }
}