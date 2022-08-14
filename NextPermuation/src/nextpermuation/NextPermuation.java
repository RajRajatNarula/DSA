 import java.util.*;
class Sol
{
    public static int[] nextpermutation(int[] num)
    {
        if(num==null || num.length<=1)
        {
            return null;
        }
        
        int i=num.length-2;
        while(i>=0 && num[i+1]<=num[i])
        {
            i-=1;
        }
        if(i>=0)
        {
            int j=num.length-1;
            while(num[j]<num[i])
            {
                j-=1;
            }
            swap(num,i,j);
        }
        reverse(num,i+1);
        
        return num;
    }
    
    public static void swap(int[] num,int i, int j)
    {
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }
    
    public static void reverse(int[] num,int start)
    {
        
        int i=start;
        int j=num.length-1;
        while(i<j)
        {
            swap(num,i,j);
            i+=1;
            j-=1;
        }
        
    }
    
    public static void main(String[] args)
    {
        int[] num={1,2,3};
        int[] res=nextpermutation(num);
        System.out.print("The Next Permuatation is: ");
        for(int i:res)
        {
            System.out.print(i+" ");
        }
    }
    
}