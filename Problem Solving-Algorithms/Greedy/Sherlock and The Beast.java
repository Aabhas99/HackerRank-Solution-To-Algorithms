import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n=sc.nextInt();
            if(n<=2)
            {
                System.out.println("-1");
                continue;
            }
            
            int k=n;
            while(n%3!=0)
            {
                n--;
            }
            while(n>0&&(k-n)%5!=0)
            {
                n-=3;
            }
            if(n%3!=0||(k-n)%5!=0)
            {
                System.out.println("-1");
                continue;
            }
            for(int y=1;y<=n;y=y+3)
            {
                System.out.print("555");
            }
            for(int y=n+1;y<=k;y=y+5)
            {
                System.out.print("33333");
            }
            System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
