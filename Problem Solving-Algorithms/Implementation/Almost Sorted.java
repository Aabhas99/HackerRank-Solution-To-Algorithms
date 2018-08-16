import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the almostSorted function below.
    static void almostSorted(int[] arr) {
    
        int ar[]=new int[arr.length];
    System.arraycopy(arr,0,ar,0,arr.length);
        Arrays.sort(ar);
        if(Arrays.equals(ar,arr))
        {
            System.out.println("yes");
            System.exit(0);
        }
        int i=0;
        int a=0,b=0,c=0;
        while(i<arr.length-1)
        {
            if(c==0&&arr[i]>arr[i+1])
            {
                a=i;
                b=i+1;
                c++;
            }
            else if(arr[i]>arr[i+1])
            {
                b=i+1;
                c++;
            }
            i++;
        }
        if(c==1||c==2)
        {
            int t=arr[a];
            arr[a]=arr[b];
            arr[b]=t;
            if(Arrays.equals(ar,arr))
            {
                System.out.println("yes");
                System.out.println("swap "+(a+1)+" "+(b+1));
            }
            else
            {
                System.out.println("no");
            }
        }
        else
        {
            if(b-a==c)
            {   
                System.out.println("yes");
                System.out.println("reverse "+(a+1)+" "+(b+1));
            }
            else
            {
                System.out.println("no");
            }
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

        almostSorted(arr);

        scanner.close();
    }
}
