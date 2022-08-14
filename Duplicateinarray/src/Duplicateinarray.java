import java.util.*;
class Sol
{
    public static int duplicate(int[] num)
    {
        int[] freq=new int[num.length];
        Arrays.fill(freq, 0);
        
        for(int i:num)
        {
            if(freq[i]==0)
            {
                freq[i]+=1;
            }
            else
            {
                return i;
            }
        }
        return -1;
        
    }
    
    public static void main(String[] args)
    {
        int[] num={1,3,4,2,2};
        int res=duplicate(num);
        
        if(res==-1)
        {
            System.out.println("There is no DUPLICATE");
        }
        else
        {
            System.out.println("The DUPLICATE is: "+res); 
        }
    }
}