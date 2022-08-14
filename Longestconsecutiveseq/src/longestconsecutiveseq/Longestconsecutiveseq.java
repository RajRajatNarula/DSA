
import static java.lang.Math.max;
import java.util.*;
class Sol
{
    public static int lcs(int[] num)
    {
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i:num)
        {
            hs.add(i);
        }
        int currentnum=0;
        int currentlen=0;
        int maxlen=0;
        for(int i:num)
        {
            currentnum=i;
            currentlen=1;
            while(hs.contains(currentnum+1))
            {
                currentlen+=1;
                currentnum+=1;
            }
            
            maxlen=max(maxlen,currentlen);
        }
        return maxlen;
    }
    
    public static void main(String[] args)
    {
        int[] num={100, 200, 1, 3, 2, 4};
        int res=lcs(num);
        System.out.println("Longest Consecutive Subsequence is: "+res);
    }
}