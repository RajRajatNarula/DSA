import java.util.*;
class Solution
{
    
    public void nextgreater(int[] arr,int n)
    {
        int[] nge=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=2*n-1;i>=0;i--)
        {
            while(stack.isEmpty()==false && stack.peek()<=arr[i%n])
            {
                stack.pop();
            }
            
            if(i<n)
            {
                if(stack.isEmpty()==false)
                {
                    nge[i]=stack.peek();
                }
                else
                {
                    nge[i]=-1;
                }
            }
            
            stack.push(arr[i%n]);
            
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.println(nge[i]+" ");
        }
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int[] arr={5,6,7};
        int n=arr.length;
        sol.nextgreater(arr,n);
    }
}