import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      long n=sc.nextLong();
        long m=sc.nextLong();
        long co=0l;
        for(long x=0;x<m;x++)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long k=((b-a+1)*c);
            co+=k;
        }
        System.out.println(co/n);
    }
}
