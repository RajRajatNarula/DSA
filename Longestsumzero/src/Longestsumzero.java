import java.util.*;
class Sol
{
    public static int longestsumzero(int[] num)
    {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int sum=0,maxlen=0;
        for(int i=0;i<num.length;i++)
        {
            sum+=num[i];
            if(sum==0)
            {
                maxlen+=1;
            }
            if(hm.get(sum)!=null)
            {
                maxlen=Math.max(maxlen, i-hm.get(sum));
            }
            else
            {
                hm.put(sum, i);
            }
            
        }
        return maxlen;
        
    }
    
    public static void main(String[] args)
    {
        int[] num={9, -3, 3, -1, 6, -5};
        int res=longestsumzero(num);
        System.out.println("Longest Sum Zero is: "+res);
        
    }
}