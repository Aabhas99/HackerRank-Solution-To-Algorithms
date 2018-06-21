import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int workbook(int n, int k, int[] arr) {
        int s=1;
        int c=0;
        for(int x=0;x<n;x++)
        {
            int co=0;
            for(int y=1;y<=arr[x];y++)
            {
                co++;
                if(co==k+1)
                {
                    s++;
                    co=1;
                }
                if(y==s)
                {
                
                    c++;
                }
            }
            s++;
        }
        return c;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = workbook(n, k, arr);
        System.out.println(result);
        in.close();
    }
}
