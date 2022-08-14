import java.util.*;
class RepeatDuplicate
{
   static void repdup(int[] arr)
   {
        int n=arr.length;
        int[] freq=new int[n+1];
        int sum=0,rep=0;
        Arrays.fill(freq, 0);
        for(int i:arr)
        {
            freq[i]+=1;
            sum+=i;
            if(freq[i]>1)
            {
                rep=i;
            }
        }
        int sumofn=(n*(n+1))/2;
        int missing=sumofn-sum+rep;
        System.out.println(rep+" "+missing);
     
   }
   public static void main(String[] args)
   {
       int[] arr={3,1,2,5,4,6,7,5};
       repdup(arr);
   }
}