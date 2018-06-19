import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long repeatedString(String s, long n) {
        long c=0l;
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)=='a')
            {
                c++;
            }
        }
       
        c=c*(n/s.length());
         
       
        int a=(int)(n%s.length());
        int d=0;
        for(int x=0;x<a;x++)
        {
            if(s.charAt(x)=='a')
            {
                c++;
                d++;
            }
        }
        
        return c;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        in.close();
    }
}
