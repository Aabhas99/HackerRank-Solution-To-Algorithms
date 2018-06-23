import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        int ar[]=new int[n];
        int ar2[]=new int[s.length()];
        for(int a0 = 0; a0 < n; a0++)
                {
                ar[a0] = in.nextInt();
        }
        int p=0;
        int w=0;
            for(int x=0;x<s.length();x++)
            {
                 int c=(int)(s.charAt(x))-96;
                if(c==p)
                {
                    w=w+c;
                }
                else
                {
                    w=c;
                }
                ar2[x]=w;
                p=c;
            }
        for(int x=0;x<n;x++)
        {
            int f=0;
            for(int y=0;y<s.length();y++)
            {
                
                if(ar[x]==ar2[y])
                {
                    System.out.println("Yes");
                    f++;
                    break;
                }
            }
            if(f==0)
            {
                System.out.println("No");
            }
        }
    }
}
