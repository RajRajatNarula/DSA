import java.util.*;
class Sol
{
    public static void Mergesorted(int m,int n,int[] num1,int[] num2)
    {
        int i=0,j=0,k=m-1;
        
        while(i<=k && j<n)
        {
            if(num1[i]<num2[j])
            {
                i+=1;
            }
            else
            {
                int temp=num1[k];
                num1[k]=num2[j];
                num2[j]=temp;
                
            }
            Arrays.sort(num1);
            Arrays.sort(num2);
        }
        
    }
    
    public static void main(String[] args)
    {
        int m=4;
        int n=5;
        int[] num1={1,3,5,7};
        int[] num2={0,2,6,8,9};
        
        
        Mergesorted(m,n,num1,num2);
        for(int i:num1)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i:num2)
        {
            System.out.print(i+" ");
        }
    } 
}