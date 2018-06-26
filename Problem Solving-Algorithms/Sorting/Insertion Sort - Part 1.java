import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
    for(int x=0;x<n;x++)
    {
        int k=arr[x];
        int y=x-1;
        while(y>-1&&arr[y]>k)
        {
            arr[y+1]=arr[y];
            for(int q=0;q<n;q++)
            {
                System.out.print(arr[q]+" ");
            }
            System.out.println();
            y--;
        }
        arr[y+1]=k;
    }
        for(int q=0;q<n;q++)
        {
            System.out.print(arr[q]+" ");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}
