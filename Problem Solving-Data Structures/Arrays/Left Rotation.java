import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        int ar[]=new int[n];
        d=d%n;
        for(int x=0;x<n;x++)
        {
            if(x-d<0)
            {
                ar[n+(x-d)]=a[x];
            }
            else
            {
                ar[x-d]=a[x];
            }
        }
        for(int x=0;x<n;x++)
        {
            System.out.print(ar[x]+" ");
        }
        scanner.close();
    }
}
