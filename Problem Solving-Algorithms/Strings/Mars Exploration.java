import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int marsExploration(String s) {
       int l=s.length()/3;
        int x=0;
        int c=0;
        while(x<s.length())
        {
            String t=s.substring(x,x+3);

            if(t.charAt(0)!='S')
            {
                c++;
            }
                if(t.charAt(1)!='O')
                {
                    c++;
                }
                    if(t.charAt(2)!='S')
                    {
                        c++;
                    }
            x=x+3;
        }
        return c;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}
