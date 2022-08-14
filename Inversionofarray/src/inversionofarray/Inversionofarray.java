import java.util.*;
class Sol
{
    public static int mergeandcount(int[] num,int l, int m,int h)
    {
        int[] left=Arrays.copyOfRange(num, l, m+1);
        int[] right=Arrays.copyOfRange(num, m+1, h+1);
        
        int i=0,j=0,swaps=0,k=l;
        
        while(i<left.length && j<right.length)
        {
            if(left[i]<=right[j])
            {
                num[k]=left[i];
                k+=1;
                i+=1;
            }
            else
            {
                num[k]=right[j];
                k+=1;
                j+=1;
                swaps+=(m+1)-(i);
            }
        }
        while(i<left.length)
        {
            num[k++]=left[i++];
        }
        while(j<right.length)
        {
            num[k++]=right[j++];
        }
        
        
        return swaps;
    }
    
    public static int mergesortandcount(int[] num,int l, int h)
    {
        int count=0;
        if(l<h)
        {
            int m=(l+h)/2;
            count+=mergesortandcount(num,l,m);
            count+=mergesortandcount(num,m+1,h);
            count+=mergeandcount(num,l,m,h);
        }
        return count;
    }
    
    
    public static void main(String[] args)
    {
        int[] num={1, 20, 6, 4, 5};
        int res=mergesortandcount(num,0,num.length-1);
        System.out.println("SWAP COUNT IS: "+res);
    }
}