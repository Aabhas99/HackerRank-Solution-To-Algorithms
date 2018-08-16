import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
    String ar[]={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fiveteen","sixteen","seventeen","eighteen","nineteen","twenty"};
        String br[]={"thirty","forty","fifty"};
    if(m==0)
    {
        return ar[h-1]+" o' clock";
    }
        if(m==15)
    {
        return "quarter past "+ar[h-1];
    }
        if(m==30)
    {
        return "half past "+ar[h-1];
    }
            if(m==45)
    {
        if(h==12)
        {
            return "quarter to one";
        }
        return "quarter to "+ar[h];
    }
        if(m>0&&m<=20)
        {
            if(m==1)
            {
                return ar[m-1]+" minute past "+ar[h-1];
            }
            return ar[m-1]+" minutes past "+ar[h-1];
        }
        if(m>20&&m<=29)
        {
            return "twenty "+ar[m-21]+" minutes past "+ar[h-1];
        }
        m=60-m;
        if(m>=21&&m<=29)
        {
            if(h==12)
            {
                return "twenty "+ar[m-21]+" minutes to one";
            }
            return "twenty "+ar[m-21]+" minutes to "+ar[h];
        }
        if(h==12)
            {
                return ar[m-1]+" minutes to one";
            }
            return ar[m-1]+" minutes to "+ar[h];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
