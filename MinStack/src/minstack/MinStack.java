import java.util.*;
class Solution
{
    Stack<Integer> stack=new Stack<>();
    int minval=Integer.MAX_VALUE;
    
    public void push(int value)
    {
        if(stack.isEmpty())
        {
            minval=value;
            stack.push(value);
        }
        else
        {
            if(value<minval)
            {
                stack.push(2*value-(minval));
                minval=value;
            }
            else
            {
                stack.push(value);
            }
        }
        System.out.println("Element is pushed");
    }
    
    
    public void pop()
    {
        if(stack.isEmpty())
        {
            System.out.println("Stack is Empty");
            return;
        }
        int popped=stack.pop();
        if(popped<minval)
        {
            minval=2*minval-popped;
        }
        
        System.out.println("Element is popped");
    }
    
    public void top()
    {
        if(stack.peek()<minval)
        {
            System.out.println("Stack Top value is: "+minval);
            return;
        }
        else
        {
            System.out.println("Stack Top value is: "+stack.peek());
            return;
        }
    }
    
    public void getmin()
    {
        System.out.println("Minimal value is: "+minval);
    }
    
    
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        sol.push(-2);
        sol.push(0);
        sol.push(-3);
        sol.getmin();
        sol.pop();
        sol.top();
        sol.getmin();
        
        
    }
}