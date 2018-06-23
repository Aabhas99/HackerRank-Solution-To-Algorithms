import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int beautifulBinaryString(String b) {
        int c=0;
        int x=0;
        while(true)
        {
            if(x<=b.length()-3)
            {
                String s=b.substring(x,x+3);
                if(s.equals("010"))
                {
                    if(x+3<b.length())
                    {
                        s=b.substring(0,x)+"011"+b.substring(x+3);
                    }
                    else
                    {
                         s=b.substring(0,x)+"011";                   
                    }
                        c++;
                        b=s;
                        x=x+3;
                }
                else
                {
                    x++;
                }
            }
            else
            {
                break;
            }
        }
        return c;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String b = in.next();
        int result = beautifulBinaryString(b);
        System.out.println(result);
        in.close();
    }
}
