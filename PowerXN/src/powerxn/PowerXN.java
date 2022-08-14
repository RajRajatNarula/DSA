import java.util.*;
class Sol
{
    public static int powxn(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return x*powxn(x,n-1);
        }
    }
    
    public static void main(String[] args)
    {
        int x=3,n=3;
        int res=powxn(x,n);
        System.out.println("The Power of X raised to N is: "+res);
        
    }
}