import java.util.*;
class Solution
{
    public int minplatforms(int[] arrival,int[] depart)
    {
        Arrays.sort(arrival);
        Arrays.sort(depart);
        int plat_needed=1,result=1;
        int i=1,j=0;
        int n=arrival.length;
        while(i<n && j<n)
        {
            if(arrival[i] <= depart[j])
            {
                plat_needed+=1;
                i++;
            }
            
            else if(arrival[i]>depart[j])
            {
                plat_needed-=1;
                j++;
            }
            
            if(result<plat_needed)
            {
                result=plat_needed;
            }
        }
        return result;
    }
    
    
    public static void main(String[] args)
    {
        
        Solution sol=new Solution();
        int[] arrival ={900,945,955,1100,1500,1800};
	int[] depart={920,1200,1130,1150,1900,2000};
		
	int totalCount=sol.minplatforms(arrival,depart);
        System.out.println("Minimum platforms needed are: "+totalCount);
    }
}