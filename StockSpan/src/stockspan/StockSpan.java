import java.util.*;
class Solution
{
    
    public void stockspan(int[] stock,int k)
    {
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> span=new ArrayList<>();
        
        for(int i=0;i<k;i++)
        {
            while(stack.isEmpty()==false && stock[stack.peek()]<=stock[i])
            {
                stack.pop();
            }
            
            if(stack.isEmpty())
            {
                span.add(i+1);
            }
            else
            {
                span.add(i-stack.peek());
            }
            stack.push(i);
        }
        
        System.out.println(span);
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int[] stock={10, 4, 5, 90, 120, 80};
        int k=stock.length;
        sol.stockspan(stock,k);
        
    }
}