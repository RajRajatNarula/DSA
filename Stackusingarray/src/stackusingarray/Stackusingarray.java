import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        s.size();
        
        s.pop();
        
        s.top();
        
        s.size();
    }
}

class Stack
{
    int[] arr=new int[1000];
    int top=-1;
    
    public void push(int num)
    {
        top+=1;
        arr[top]=num;
        System.out.println("Element pushed is: "+num);
    }
    
    public void pop()
    {
        if(top!=-1)
        {
            int num=arr[top];
            top-=1;
            System.out.println("Element popped is: "+num);
        }
        else
        {
            System.out.println("Pop cannot be performed");
        }
    }
    
    public void top()
    {
        System.out.println("Element on Top of stack is: "+arr[top]);
    }
    
    public void size()
    {
        System.out.println("Size of stack is: "+(top+1));
    }
}