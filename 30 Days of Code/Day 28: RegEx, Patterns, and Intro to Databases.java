import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ar[]=new String[n];
        int q=-1;
        for(int x=0;x<n;x++)
        {
            String a=sc.next();
            String b=sc.next();
            int c=b.indexOf('@');
            b=b.substring(c);
            if(b.equals("@gmail.com"))
            {
                ar[++q]=a;
            }
        }
        sc.close();
        for(int x=0;x<=q-1;x++)
        {
            for(int y=0;y<=q-1-x;y++)
            {
                if(ar[y+1].compareTo(ar[y])<0)
                {
                    String t=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=t;
                }
            }
        }
        for(int x=0;x<=q;x++)
        {
            System.out.println(ar[x]);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
