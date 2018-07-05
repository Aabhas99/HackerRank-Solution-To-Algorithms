import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long i=0l,j=0l;
        for(int x=0;x<a;x++)
        {
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(x==0)
            {
                i=b;
                j=c;
            }
            if(b<i)
            {
                i=b;
            }
            if(c<j)
            {
                j=c;
            }
        }
        System.out.println(i*j);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
