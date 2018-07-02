import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int x=0;x<n;x++)
        {
            int a=sc.nextInt();
            int ar[]=new int[a-1];
            long m=1l;
            for(int y=0;y<a-1;y++)
            {
                ar[y]=sc.nextInt();
                
                m=m*(long)ar[y];
                m=m%1234567;
            }
            System.out.println(m);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
