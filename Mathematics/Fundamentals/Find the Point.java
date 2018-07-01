import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p[]=new int[2*n];
        int q[]=new int[2*n];
        int c=0;
        for(int x=0;x<n;x++)
        {
            p[c++]=sc.nextInt();
            p[c--]=sc.nextInt();
            q[c++]=sc.nextInt();
            q[c++]=sc.nextInt();
        }
        c=0;
        for(int x=0;x<n;x++)
        {
            System.out.print(2*q[c]-p[c]+" ");
            c++;
            System.out.println(2*q[c]-p[c]);
            c++;
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
