import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] ar) {
    Arrays.sort(ar);
        int i=-1;
        int a[]=new int[ar.length]; 
        int c=9999999;
        for(int x=1;x<ar.length;x++)
        {
            if(ar[x]-ar[x-1]<c)
            {
                c=ar[x]-ar[x-1];
            }
            if(c==1)
            {
                break;
            }
        }
        for(int x=1;x<ar.length;x++)
        {
            if(ar[x]-ar[x-1]==c)
            {
                a[++i]=ar[x-1];
                a[++i]=ar[x];
            }
        }
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            if(result[i]==0)
            {
                break;
            }
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
