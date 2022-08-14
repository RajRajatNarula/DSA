import java.util.*;
class Sol
{
    public static boolean search(int target,int[][] num)
    {
        int m=num.length;
        int n=num[0].length;
        int low=0;
        int high=(m*n)-1;
        
        while(low<=high)
        {
            int mid=(high+low)/2;
            if(num[mid/n][mid%n]==target)
            {
                return true;
            }
            else if(num[mid/n][mid%n]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        int[][] num={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean res=search(7,num);
        if(res)
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element Not Found");
        }
    }
}