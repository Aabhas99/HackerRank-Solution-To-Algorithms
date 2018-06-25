import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumAbsoluteDifference(int n, int[] arr) {
        int a=Math.abs(arr[1]-arr[0]);
        Arrays.sort(arr);
        for(int x=0;x<n-1;x++)
        {
            if(Math.abs(arr[x]-arr[x+1])<a)
            {
                a=Math.abs(arr[x]-arr[x+1]);
                if(a==0)
                {
                    return a;
                }
            }
        }
        return a;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = minimumAbsoluteDifference(n, arr);
        System.out.println(result);
        in.close();
    }
}
