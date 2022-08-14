import java.util.*;
class meeting
{
    int start;
    int end;
    int pos;
    meeting(int start,int end,int pos)
    {
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
}

class mycomparator implements Comparator<meeting>
{

    @Override
    public int compare(meeting o1, meeting o2)
    {
        if(o1.end < o2.end)
            return -1;
        else if(o1.end > o2.end)
            return 1;
        else if(o1.end==o2.end && o1.pos<o2.pos)
            return -1;
        return 1;
    }
    
}

class Solution
{
    public void nmeeting(int[] start,int[] end)
    {
        ArrayList<meeting> meet=new ArrayList<>();
        for(int i=0;i<start.length;i++)
        {
            meet.add(new meeting(start[i],end[i],i+1));
        }
        
        mycomparator mc=new mycomparator();
        Collections.sort(meet, mc);
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(meet.get(0).pos);
        int limit=meet.get(0).end;
        for(int i=1;i<start.length;i++)
        {
            if(meet.get(i).start>=limit)
            {
                arr.add(meet.get(i).pos);
                limit=meet.get(i).end;
            }
        }
        
        System.out.print("The Position of meetings: ");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,5,7,9,9};
        sol.nmeeting(start,end);
    }
}