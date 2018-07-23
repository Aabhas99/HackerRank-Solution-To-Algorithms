import java.util.*;
class g
{
    long v;
    List<Integer> ar[];
    int c=0;
    g(long v)
    {
        this.v=v;
        ar=new LinkedList[(int)v];
        for(int x=0;x<(int)v;x++)
        {
            ar[x]=new LinkedList<>();
        }
    }
    void a(int i,int j)
    {
        ar[i-1].add(j);
        ar[j-1].add(i);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for(int x=0;x<q;x++)
        {
            long n=sc.nextLong();
            g o=new g(n);
            int m=sc.nextInt();
            long l=sc.nextLong();
            long r=sc.nextLong();
            for(int y=0;y<m;y++)
            {
                int i=sc.nextInt();
                int j=sc.nextInt();
                o.a(i,j);
            }
            o.arr();
            if(r>=l)
            {
                long ss=0l;
                ss=n*l;
                System.out.println(ss);
            }
            else
            {
                long ss=o.c*l;
                ss+=(o.v-o.c)*r;
                System.out.println(ss);
            }
        }
    }
    void arr()
    {
        boolean r[]=new boolean[(int)v];
        for(int x=0;x<v;x++)
        {
            if(r[x]==false)
            {
                c++;
                s(x+1,r);
            }
        }
    }
    void s(int q,boolean za[])
    {
        za[q-1]=true;
        Iterator<Integer> i=ar[q-1].listIterator();
        while (i.hasNext())
        {
            int o = i.next();
            if (!za[o-1])
                s(o,za);
        }
    }
}
