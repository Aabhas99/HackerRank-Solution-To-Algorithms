import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sansaXor(int[] arr) {
        int a=0;
        if(arr.length%2==0)
        {
            return 0;
        }
        for(int x=0;x<arr.length;x+=2)
        {
            a=a^arr[x];
        }
        return a;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int result = sansaXor(arr);
            System.out.println(result);
        }
        in.close();
    }
}
