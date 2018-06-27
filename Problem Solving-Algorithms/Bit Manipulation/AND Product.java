import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long andProduct(long a, long b) {
        if((a&b)==0l)
        {
            return 0l;
        }
        long k=a;
        for(long x=a+1;x<b;x++)
        {
            k=k&x;
            if(k==0l)
            {
                return 0;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            long a = in.nextLong();
            long b = in.nextLong();
            long result = andProduct(a, b);
            System.out.println(result);
        }
        in.close();
    }
}
