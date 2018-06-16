import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] )  {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=0;
        for(int x=0;x<a;x++)
        {
            int c=sc.nextInt();
            if(!(b==x))
            {
                s=s+c;
            }
        }
        int aa=sc.nextInt();
        if(s/2==aa)
        {
            System.out.println("Bon Appetit");
        }
        else
        {
            System.out.println(aa-s/2);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    }
}
