import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the xorSequence function below.
     */
    static long xorSequence(long l, long r) {
        long a=l;
        long b=r;
        long x=0;
        while(a<r&&a%4!=0)
        {
            a++;
        }
        while(b>l&&b%4!=0)
        {
            b--;
        }
        if(a%4!=0&&b%4!=0)
        {
            
            long k=a;
            while(k%4!=0)
            {
                k++;
            }
            if(a==b)
            {
                if(b%2==0)
                {
                    return k-1;
                }
                if(k-b==1)
                {
                    return 0;
                }
                if(b==1)
                {
                    return 0;
                }
                return 1;
            }
            if(a-b==2)
            {
                return (k-1)^1;
            }
            if(b%2==0)
            {
                return k-1;
            }
            return (k-1)^1;
        }
        if(a-l>=2)
        {
            x=x^(a-1);
        }
        if(a-l==3)
        {
            x=x^1;
        }
        if((b-a)%4==0&&((b-a)/4)%2!=0)
        {
            x=x^2;
        }
        if((r-b)>=0)
        {
            x=x^b;
        }
        if((r-b)>=1)
        {
            x=x^1;
        }
        if((r-b)>=2)
        {
            x=x^(b+3);
        }
        return x;
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(scanner.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String[] lr = scanner.nextLine().split(" ");

            long l = Long.parseLong(lr[0].trim());

            long r = Long.parseLong(lr[1].trim());

            long result = xorSequence(l, r);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
