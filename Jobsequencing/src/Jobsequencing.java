import java.util.*;
class Job
{
    int id;
    int dl;
    int profit;
    Job(int id,int dl,int profit)
    {
        this.id=id;
        this.dl=dl;
        this.profit=profit;
    }
}

class mycomparator implements Comparator<Job>
{

    @Override
    public int compare(Job o1, Job o2) {
        if(o1.profit<o2.profit)
            return 1;
        else if(o1.profit>o2.profit)
            return -1;
        return 1;
    }
    
}

class Solution
{
    public void jobsequencing(Job[] jobs,int n)
    {
        mycomparator mc=new mycomparator();
        Arrays.sort(jobs, mc);
        int maxdl=0;
        for(int i=0;i<n;i++)
        {
            if(maxdl<jobs[i].dl)
            {
                maxdl=jobs[i].dl;
            }
        }
        
        int[] result=new int[maxdl+1];
        for(int i=1;i<maxdl+1;i++)
        {
            result[i]=-1;
        }
        
        int totaljobs=0;
        int totalprofit=0;
        for(int i=0;i<n;i++)
        {
            for(int j=jobs[i].dl;j>0;j--)
            {
                if(result[j]==-1)
                {
                    result[j]=i;
                    totaljobs+=1;
                    totalprofit+=jobs[i].profit;
                    break;
                }
            }
        }
        System.out.println("The Total Jobs: "+totaljobs);
        System.out.println("The Profit from performing these jobs: "+totalprofit);
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        
        Job[] jobs=new Job[4];
        jobs[0]=new Job(1,4,20);
        jobs[1]=new Job(2,1,10);
        jobs[2]=new Job(3,2,40);
        jobs[3]=new Job(4,2,30);
        sol.jobsequencing(jobs, jobs.length);
        
        
        
    }
}

