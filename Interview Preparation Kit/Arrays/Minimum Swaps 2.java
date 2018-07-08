import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int x=0;x<n;x++)
        {
            a[x]=(sc.nextInt());
        }
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(i+1!=a[i])
            {
                int t=i;
                while(a[t]!=i+1)
                {
                    t++;  
                }
                int temp=a[t];
                a[t]=a[i];
                a[i]=temp;
                c++;
            }
        }
        System.out.println(c);
    }
}
