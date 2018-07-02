import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int x=0;x<a;x++)
        {
            int b=sc.nextInt();
            int c=sc.nextInt();
                int t=b;
            int y=c;
            while(b%c!=0)
            {
                int k=b%c;
                b=c;
                c=k;
            }
            System.out.println(t*y/(c*c));
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
