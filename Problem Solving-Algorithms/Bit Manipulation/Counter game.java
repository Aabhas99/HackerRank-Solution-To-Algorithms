import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String counterGame(long n) {
        int c=0;
        int x=1;
        
        while(n>1)
        {
            long k=1l;
            while(k<=n)
        {
            k*=2;
        }
        k/=2;
            if(k!=n)
            {
                n=n-k;
            }
            else
            {
                n=n/2;
            }
            c++;
        }
        if(c%2==0)
        {
            return "Richard";
        }
        return "Louise";
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            String result = counterGame(n);
            System.out.println(result);
        }
        in.close();
    }
}
