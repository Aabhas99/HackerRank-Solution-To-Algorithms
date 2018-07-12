import java.io.*;
import java.util.*;
class abc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ar[]=new int[n];
        for(int x=0;x<n;x++)
        {
            ar[x]=sc.nextInt();
        }
        Arrays.sort(ar);
        int a=0;
        Queue<Integer> q = new LinkedList<>();
        int co=0;
        while(true)
        {
            
            if((q.isEmpty()&&ar[a]>=k)||(a==n&&q.peek()>=k)||(!q.isEmpty()&&q.peek()>=k&&ar[a]>=k))
            {
                System.out.println(co);
                break;
            }
            if(n-co==1)
            {
                System.out.println("-1");
                break;
            }
            co++;
            if(q.isEmpty())
            {
                q.add(ar[a]+2*ar[a+1]);
                a+=2;
            }
            else if(a==n)
            {
                q.add(q.remove()+2*q.remove());
            }
            else
            {
                int i=0,j=0;
                if(ar[a]<q.peek())
                {
                    i=ar[a++];
                    if(a!=n)
                    {
                        if(ar[a]<q.peek())
                        {
                            j=ar[a++];
                        }
                        else
                        {
                            j=q.remove();
                        }
                    }
                    else
                    {
                        j=q.remove();
                    }
                }
                else
                {
                    i=q.remove();
                    if(!q.isEmpty())
                    {
                        if(q.peek()<ar[a])
                        {
                            j=q.remove();
                        }
                        else
                        {
                            j=ar[a++];
                        }
                    }
                    else
                    {
                        j=ar[a++];
                    }
                }
                q.add(i+2*j);
            }
            
        }
    }
}
