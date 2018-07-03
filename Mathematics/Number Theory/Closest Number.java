import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int x=0;x<n;x++)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long z=(long)Math.pow(a,b);
            long m=(z%c);
            if(m==0)
            {
                System.out.println(z);
            }
            else
            {
                if(m>c/2)
                {
                    System.out.println(z+c-m);
                }
                else
                {
                    System.out.println(z-m);
                }
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
