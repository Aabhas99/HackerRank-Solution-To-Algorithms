import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int camelcase(String s) {
        char ar[]=s.toCharArray();
        if(s.equals(""))
        {
            return 0;
        }
        else
        {
                    int c=1;
            for(int x=0;x<s.length();x++)
            {
                if(ar[x]>=65&&ar[x]<=90)
                {
                    c++;
                }
            }
            return c;
        }
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}
