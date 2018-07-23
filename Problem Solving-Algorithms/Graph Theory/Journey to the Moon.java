import java.util.*;
class g
{
    int v;
    int c=0;
    List<Integer> ar[];
    List<Integer> l=new ArrayList<>();
    g(int v)
    {
        this.v=v;
        ar=new List[v];
        for(int x=0;x<v;x++)
        {
            ar[x]=new LinkedList<>();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        g o=new g(n);
        int p=sc.nextInt();
        for(int x=0;x<p;x++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            o.ar[a].add(b);
            o.ar[b].add(a);
        }
        o.arr();
        long w=(long)o.l.get(o.l.size()-1);
        long sum=0l;
        for(int x=o.l.size()-2;x>=0;x--)
        {
            int aa=o.l.get(x);
            sum+=w*aa;
            w+=aa;
        }
        System.out.println(sum);
    }
    void arr()
    {
        boolean za[]=new boolean[v];
        for(int x=0;x<v;x++)
        {
            if(za[x]==false)
            {
                c=0;
                s(x,za);
                l.add(c);
            }
        }
    }
    void s(int v,boolean za[])
    {
        za[v]=true;
        c++;
        Iterator<Integer> i = ar[v].listIterator();
        while (i.hasNext())
        {
            int o = i.next();
            if (!za[o])
                s(o,za);
        }
    }
}
