import java.util.*;
class Solution
{
    public void smaller(int[] arr,int n)
    {
        int[] nse=new int[n];
        Stack<Integer> stack=new Stack<>();
        
        for(int i=n-1;i>=0;i--)
        {
            int temp=arr[i];
            while(stack.isEmpty()==false && temp<=stack.peek())
                {
                    stack.pop();
                }
           
            
            if(stack.isEmpty()==false)
            {
                nse[i]=stack.peek();
            }
            else
            {
                nse[i]=-1;
            }
            
            stack.push(temp);
           
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(nse[i]+" ");
        }
    }
    
     public static void main(String[] args)
    {
        Solution sol=new Solution();
        int[] arr={13,7,6,12};
        int n=arr.length;
        sol.smaller(arr,n);
    }
}