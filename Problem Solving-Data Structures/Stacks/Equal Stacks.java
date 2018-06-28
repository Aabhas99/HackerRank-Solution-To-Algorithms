import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class a
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int a1=0,a2=0,a3=0;
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        Stack<Integer> s3=new Stack<>();
        for(int x=0;x<a;x++)
        {
            int q=sc.nextInt();
            a1=a1+q;
            s1.push(q);
        }
        for(int x=0;x<b;x++)
        {
            int q=sc.nextInt();
            a2=a2+q;
            s2.push(q);
        }
        for(int x=0;x<c;x++)
        {
            int q=sc.nextInt();
            a3=a3+q;
            s3.push(q);
        }
        Collections.reverse(s1);
        Collections.reverse(s2);
        Collections.reverse(s3);
        while(true)
        {
            if(a1>a2)
            {
                while(a1>a2)
                {
                    a1-=s1.pop();
                }
            }
            else
            {
                while(a2>a1)
                {
                    a2-=s2.pop();
                }
            }
            int co=a1<a2?a1:a2;
            if(co==a1)
            {
                if(a1>a3)
                {
                    while(a1>a3)
                    {
                         a1-=s1.pop();
                    }
                }
                else
                {
                    while(a3>a1)
                    {
                        a3-=s3.pop();
                    }
                }
            }
            else
            {
                if(a2>a3)
                {
                    while(a2>a3)
                    {
                         a2-=s2.pop();
                    }
                }
                else
                {
                    while(a3>a2)
                    {
                        a3-=s3.pop();
                    }
                }
            }
            if(a1==a2&&a2==a3)
            {
                System.out.println(a1);
                break;
            }
        }
    }
}
