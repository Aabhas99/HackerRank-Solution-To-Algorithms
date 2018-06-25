import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hackerlandRadioTransmitters function below.
    static int hackerlandRadioTransmitters(int[] x, int k) {
        Arrays.sort(x);
        int w=x[0];
        int i=0;
        for(int z=1;z<x.length;z++)
        {
            while(z!=x.length&&x[z]==w)
            {
                z++;
            }
            if(z!=x.length)
            {
                x[++i]=x[z];
                w=x[z];
            }
        }
        
        int c=0,p=0;
        while(true)
        {
            if(p==i)
            {
                c++;
                return c;
            }
            if(x[p+1]>x[p]+k)
            {
                c++;
                p++;
            }
            else
            {
                int q=p+1;
                while(q!=i+1&&x[q]-k<=x[p])
                {
                    q++;
                }
                c++;
                if(q!=i+1)
                {
                    int t=q;
                    while(t!=i+1&&x[q-1]+k>=x[t])
                    {
                        t++;
                    }
                    if(t!=i+1)
                    {
                        p=t;
                    }
                    else
                    {
                        return c;
                    }
                }
                else
                {
                    return c;
                }
            }
        }
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] x = new int[n];

        String[] xItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int xItem = Integer.parseInt(xItems[i]);
            x[i] = xItem;
        }

        int result = hackerlandRadioTransmitters(x, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
