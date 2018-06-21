import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long strangeCode(long t) {
        long s=4l;
        long l=3l;
        long q=s;
        while(true)
        {
            if(s>t)
            {
                break;
            }
            q=s;
            s=s+l*2;
            l*=2;
        }
        return s-t;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long result = strangeCode(t);
        System.out.println(result);
        in.close();
    }
}
