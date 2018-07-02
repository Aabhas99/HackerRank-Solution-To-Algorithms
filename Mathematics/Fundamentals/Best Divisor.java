import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l=1;
        int no=n;
        for(int x=1;x<=n;x++)
        {
            if(n%x==0)
            {
                int s=0;
                int t=x;
                while(t>0)
                {
                    s=s+t%10;
                    t=t/10;
                }
               
                if(s>l)
                {
                    l=s;
                    no=x;
                }
            }
            if(x==n/2)
            {
                x=n-1;
            }
        }
        System.out.println(no);
    }
}
