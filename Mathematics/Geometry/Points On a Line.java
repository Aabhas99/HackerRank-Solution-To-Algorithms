import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0,b=0;
        int c=0,d=0;
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            if(a0==0)
            {
                c=x;
                d=y;
            }
            if(x==c)
            {
                a++;
            }
            if(y==d)
            {
                b++;
            }
        }
        if(a==n||b==n)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
