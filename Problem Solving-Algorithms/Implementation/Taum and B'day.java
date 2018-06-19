import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long taumBday(long b, long w, long x, long y, long z) {
        if((z>x&&z>y)||(z==x&&z==y)||(x==y))
        {
            return (b*x)+(w*y);
        }
        if(x<y&&z+x<y)
        {
            
            return (x*b)+w*(x+z);
        }
        if(x>y&&z+y<x)
        {
            return (y*w)+b*(y+z);
        }
        return (b*x)+(w*y);
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long result = taumBday(b, w, x, y, z);
            System.out.println(result);
        }
        in.close();
    }
}
