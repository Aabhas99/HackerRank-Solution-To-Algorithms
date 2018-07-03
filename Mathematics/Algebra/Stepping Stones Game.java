import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int x=0;x<a;x++)
        {
            int c=0;
            long b=sc.nextLong();
            double n=(-1+Math.sqrt(1l+8*b))/2;
            int na=(int)n;
            if((double)na==n)
            {
                System.out.println("Go On Bob "+na);
                c++;
            }
            if(c==0)
            {
                System.out.println("Better Luck Next Time");
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
