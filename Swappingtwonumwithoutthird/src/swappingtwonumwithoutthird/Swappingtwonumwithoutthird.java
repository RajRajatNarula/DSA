import java.util.*;
class Solution
{
    
    public void swap(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(b);
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int a=10,b=20;
        sol.swap(a,b);
    }
}