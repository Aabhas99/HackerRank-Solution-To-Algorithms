import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void extraLongFactorials(int n) {
        BigInteger a=new BigInteger("1");
        for(int x=2;x<=n;x++)
        {
            a=a.multiply(BigInteger.valueOf(x));
        }
        System.out.println(a);
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }
}
