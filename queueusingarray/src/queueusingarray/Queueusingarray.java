import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Queue q=new Queue();
        for(int i=1;i<=4;i++)
        {
            q.push(i);
        }
        q.display();
        System.out.println("");
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.display();
        
    }
}

class Queue
{
     int maxsize=5;
     int[] queue=new int[maxsize];
     int start=-1;
     int end=-1;
     
     public void push(int num)
     {
         if(end==maxsize-1)
         {
             System.out.println("Queue is full");
         }
         else
         {
             if(start==-1 && end==-1)
             {
                 start=0;
                 end=0;
             }
             else
             {
                 end=end+1;
             }
             
             queue[end]=num;
             System.out.println("Element pushed is: "+num);
         }
     }
     
     public void pop()
     {
         
         if(start==-1 || start>end)
         {
             System.out.println("Queue is Empty");
         }
         else
         {
            int num=queue[start];
            System.out.println("Popped Element is: "+num);
            if(start==end)
            {
                start=-1;
                end=-1;
                
            }
            else
            {
                start=start+1;
            }
         }
         
     }
     
     public void display()
     {
         if(start==-1 || start>end)
         {
             System.out.println("Queue is Empty");
         }
         else
         {
            int front=start;
            while(front<=end)
            {
                System.out.print(queue[front]+" ");
                front+=1;
            }
         }
     }
}