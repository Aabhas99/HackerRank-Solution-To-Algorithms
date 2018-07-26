import java.io.*;
import java.util.*;
class abc
{
    int v;
    int c;
    List<Integer> ar[];
    int a[];
    abc(int v)
    {
        this.v=v;
        c=0;
        ar=new List[v];
        a=new int[v];
        for(int x=0;x<v;x++)
        {
            ar[x]=new LinkedList<>();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        abc o=new abc(n);
        for(int y=0;y<m;y++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            o.ar[a-1].add(b);
            o.ar[b-1].add(a);
        }
        for(int x=n;x>=1;x--)
        {
            if(o.ar[x-1].size()==1)
            {
                o.a[x-1]=1;
            }
            else
            {
                int co=1;
                Iterator<Integer> i=o.ar[x-1].listIterator();
                while(i.hasNext())
                {
                    int w=i.next();
                    if(w<x)
                    {
                        continue;
                    }
                    co+=o.a[w-1];
                }
                if(co%2==0)
                {
                    o.c++;
                }
                o.a[x-1]=co;
            }
        }
        
        System.out.println(o.c-1);
    }
}
