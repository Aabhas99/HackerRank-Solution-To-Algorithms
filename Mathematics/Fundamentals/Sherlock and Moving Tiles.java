import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        for(int x=0;x<d;x++)
        {
            long e=sc.nextLong();
            System.out.println(Math.sqrt(2)*(a*1.0-Math.sqrt(e))/Math.abs(b*1.0-c*1.0));
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
