import java.io.*;
import java.util.*;

public class Solution {
    static long ar[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        ar=new long[q];
        int c=-1;
        for(int x=0;x<q;x++)
        {
            int a=sc.nextInt();
            if(a==1)
            {
                long b=sc.nextLong();
                ar[++c]=b;
                if(c!=0)
                {
                    m(b,c);
                }
            }
            else if(a==2)
            {
                long b=sc.nextLong();
                int qq=0;
                for(qq=0;qq<=c;qq++)
                {
                    if(ar[qq]==b)
                    {
                        break;
                    }
                }
                ar[qq]=ar[c];
                c--;
                ma(qq,c);
            }
            else
            {
                System.out.println(ar[0]);
                continue;
            }
        }
    }
    static void m(long b,int c)
    {
        if(c!=0&&c%2!=0&&ar[(c-1)/2]>b)
        {
            ar[c]=ar[(c-1)/2];
            ar[(c-1)/2]=b;
            m(b,(c-1)/2);
        }
        else if(c!=0&&ar[(c-2)/2]>b)
        {
            ar[c]=ar[(c-2)/2];
            ar[(c-2)/2]=b;
            m(b,(c-2)/2);
        }
    }
    static void ma(int i,int c)
    {
        if((i*2)+1>c)
        {
            return;
        }
        else if((i*2)+2>c&&ar[(i*2)+1]<ar[i])
        {
            long w=ar[i];
            ar[i]=ar[(i*2)+1];
            ar[(i*2)+1]=w;
        }
        else
        {
            if(ar[(i*2)+1]<ar[(i*2)+2])
            {
                long w=ar[i];
                ar[i]=ar[(i*2)+1];
                ar[(i*2)+1]=w;
                ma((i*2)+1,c);
            }
            else
            {
                long w=ar[i];
                ar[i]=ar[(i*2)+2];
                ar[(i*2)+2]=w;
                ma((i*2)+2,c);
            }
        }
    }
}
