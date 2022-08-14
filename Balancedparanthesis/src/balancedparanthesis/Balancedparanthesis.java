import java.util.*;
class Solution
{
    public boolean isvalid(String str)
    {
        Stack<Character> stack=new Stack<>();
        for(char i:str.toCharArray())
        {
            if(i=='(' || i=='{' || i=='[')
            {
                stack.push(i);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                else
                {
                    char ch=stack.pop();
                    if((i==')' && ch=='(') || (i=='}' && ch=='{') || (i==']' && ch=='['))
                    {
                        continue;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
            
        }
        
        return stack.isEmpty();
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        String str="()[{(}]";
        if(sol.isvalid(str)==true)
        {
            System.out.println("It is Balanced");
        }
        else
        {
            System.out.println("It is not Balanced");
        }
    }
            
}