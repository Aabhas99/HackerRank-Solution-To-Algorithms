import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int x=0;x<n;x++)
        {
            ar[x]=sc.nextInt();
        }
        int c=0;
        for(int x=0;x<n;x++)
        {
            for(int y=x;y<n;y++)
            {
                int s=0;
                for(int z=x;z<=y;z++)
                {
                   s=s+ar[z]; 
                }
                if(s<0)
                {
                    c++;
                }
            }
        }
        System.out.println(c);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
