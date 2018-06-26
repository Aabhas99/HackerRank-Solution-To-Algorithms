import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long solve(long n) {
        long c=0;
        while(n>0)
        {
            if(n%2==0)
            {
                c++;
            }
            n/=2;
        }
        return (long)Math.pow(2,c);
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long result = solve(n);
        System.out.println(result);
    }
}
