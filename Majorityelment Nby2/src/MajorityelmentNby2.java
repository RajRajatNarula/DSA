import java.util.*;
class Sol
{
    public static int majority(int[] num)
    {
        int count=0,candidate=0;
        for(int i:num)
        {
            if(count==0)
            {
                candidate=i;
            }
            if(i==candidate)
            {
                count+=1;
            }
            else
            {
                count-=1;
            }
        }
        return candidate;
    }
    
    public static void main(String[] args)
    {
        int[] num={1,1,1,2,2};
        int res=majority(num);
        System.out.println("The Majority Element is: "+res);
    }
}