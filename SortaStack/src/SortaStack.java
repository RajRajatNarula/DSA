import java.util.*;
class Solution
{
    public void sortstack(Stack<Integer> input)
    {
        Stack<Integer> stack=new Stack<>();
        int n=input.size();
       
        while(input.isEmpty()==false)
        {
            int temp=input.pop();
            while(stack.isEmpty()==false && stack.peek()>temp)
            {
                input.push(stack.pop());
            }
            stack.push(temp);
        }
        System.out.println(stack);
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        Stack<Integer> input=new Stack<>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);
        input.peek();
        
        sol.sortstack(input);
       
    }
            
            
}