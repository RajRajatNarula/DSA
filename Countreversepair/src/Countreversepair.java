import java.util.*;
class Sol
{
    public static int merge(int[] num,int l,int mid,int h)
    {
        int[] left=Arrays.copyOfRange(num, l, mid+1);
        int[] right=Arrays.copyOfRange(num, mid+1, h+1);
        
        int count=0;
        int i=0,j=0;
        
        for(i=0;i<left.length;i++)
        {
            while(j<right.length && left[i]>2*(right[j]))
            {
                j+=1;
            }
            count+=j;
        }
        
        i=0;
        j=0;
        int k=l;
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
        
        return count;
    }
    
    public static int mergesort(int[] num,int l,int h)
    {
        int c=0;
        if(l<h)
        {
            int mid=(l+h)/2;
            c+=mergesort(num,l,mid);
            c+=mergesort(num,mid+1,h);
            c+=merge(num,l,mid,h);
        }
        
        return c;
    }
    public static void reversepaircount(int[] num)
    {
        int res=mergesort(num,0,num.length-1);
        System.out.println("Reverse Pair Count: "+res);
    }
    
    public static void main(String[] args)
    {
        int[] num={1,3,2,3,1};
        reversepaircount(num);
        
    }
            
}