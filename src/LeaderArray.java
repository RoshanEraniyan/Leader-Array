import java.util.*;

class Solution
{
    public void leaderArray(int n,int[] array)
    {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n-1;i++)
        {
            int count=0;
            for(int j=i+1;j<n;j++)
            {
                if(array[i]>array[j])
                {
                    count++;
                }
            }
            if(count==n-(i+1))
            {
                l.add(array[i]);
            }

        }
        l.add(array[n-1]);
        for(int x:l)
        {
            System.out.print(x+" ");
        }

    }
}

class LeaderArray
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        Solution solution =new Solution();
        solution.leaderArray(n,array);
    }
}
