import java.util.*;
class Solution
{
    public int removeduplicate(int[] arr)
    {
         int i=0;
         for(int j=1;j<arr.length;j++)
         {
             if(arr[i]!=arr[j])
             {
                 i++;
                 arr[i]=arr[j];
             }
         }
         return i+1;
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int[] arr=new int[]{1,2,2,2,3,3};
        int res=sol.removeduplicate(arr);
        for(int i=0;i<res;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}