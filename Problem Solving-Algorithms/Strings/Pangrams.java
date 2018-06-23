import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        int f=0;
        for(int x=97;x<=122;x++)
        {
            int c=0;
            for(int y=0;y<s.length();y++)
            {
                if((char)(x)==s.charAt(y))
                {
                    c++;
                }
            }
            if(c==0)
            {
               f++;
                System.out.println("not pangram");
                 break;
            }
        }
        if(f==0)
        {
                     System.out.println("pangram");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    }
}
