import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int countingValleys(int n, String s) {
        int c=0,co1=0,co2=0;
        char d='U',k='D';
        for(int x=0;x<n;x++)
        {
            
            if(s.charAt(x)=='U')
            {
                d='U';
                c++;
            }
            else
            {
                d='D';
                c--;
            }
            if(c==-1&&d=='D')
            {
                    co1++;
            }
            if(c==0&&d=='U')
            {
                    co2++;
            }
        }
        return co1<co2?co1:co2;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
