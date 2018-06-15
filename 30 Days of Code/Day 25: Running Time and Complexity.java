import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int x=0;x<a;x++)
        {
            int b=sc.nextInt();
            int f=0;
            if(b<2)
            {
                System.out.println("Not prime");
                continue;
            }
            for(int y=2;y<=Math.sqrt(b);y++)
            {
                if(b%y==0)
                {
                    f++;
                    break;
                }
            }
            if(f==0)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not prime");
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
