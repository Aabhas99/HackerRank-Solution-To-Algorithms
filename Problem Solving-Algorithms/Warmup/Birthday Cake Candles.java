import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
       int c=ar[0],d=0;;
        for(int x=1;x<n;x++)
       {
            if(c<ar[x])
                c=ar[x];
        }
        for(int x=0;x<n;x++)
        {
            if(ar[x]==c)
                d++;
        }
        return d;
            // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
