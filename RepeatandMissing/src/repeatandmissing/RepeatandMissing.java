import java.util.*;
class Sol
{
    public static int[] repeatmissing(int[] num)
    {
        int[] arr=new int[2];
        int repeat=0;
        int [] freq=new int[num.length+1];
        Arrays.fill(freq, 0);
        int sum=0;
        for(int i:num)
        {
            if(freq[i]==0)
            {
                freq[i]+=1;
            }
            else
            {
                repeat=i;
            }
            sum+=i;
        }
        
        int missing=((num.length*(num.length+1))/2)-sum+repeat;
        
        arr[0]=repeat;
        arr[1]=missing;
        
        return arr;
    }
    
    public static void main(String[] args)
    {
        int[] num={3,1,2,5,3};
        int[] res=repeatmissing(num);
        System.out.println("Repeating Number is: "+res[0]+"\nMissing Number is: "+res[1]);
    }
}