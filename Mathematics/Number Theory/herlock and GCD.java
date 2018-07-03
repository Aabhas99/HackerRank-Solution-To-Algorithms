import java.io.*;
import java.util.*;

public class Solution {
    static int gcd(int a,int b)
    {
            int c=0;
            while(b%a!=0)
            {
                c=b%a;
                b=a;
                a=c;
            }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int x=0;x<a;x++)
        {
            int b=sc.nextInt();
            int ar[]=new int[b];
                                 int t=0;
            for(int y=0;y<b;y++)
            {
                ar[y]=sc.nextInt();
            }
            a1:
            for(int y=0;y<b;y++)
            {

                for(int z=y;z<b;z++)
                {
                    int d=ar[y];
                    for(int q=y;q<=z;q++)
                    {
                        d=gcd(d,ar[q]);

                    }
                    if(d==1)
                    {
                        t++;
                        System.out.println("YES");
                        break a1;
                    }
                
                }
               
            }
             if(t==0)
                {
                    System.out.println("NO");
                }
            
        }
       
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
