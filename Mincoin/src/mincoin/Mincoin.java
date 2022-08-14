import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        int[] currency={1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int n=currency.length;
        int i=n-1;
        int count=0;
        int value=70;
        while(i>=0)
        {
            if(currency[i]<=value)
            {
                value-=currency[i];
                count+=1;
                if(value==0)
                {
                    break;
                }
            }
            else
            {
                i-=1;
            }
        }
        System.out.println(count);
    }
}