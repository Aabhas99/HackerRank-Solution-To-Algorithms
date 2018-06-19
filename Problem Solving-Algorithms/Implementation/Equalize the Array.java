import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int equalizeArray(int[] arr) {
        Arrays.sort(arr);
        int a=arr[0];
        int c=1;
        int co=0;
        for(int x=1;x<arr.length;x++)
        {
            if(arr[x]==a)
            {
                c++;
            }
            else
            {
                if(c>co)
                {
                    co=c;
                }
                c=1;
                a=arr[x];
                
            }
        }
        if(c>co)
                {
                    co=c;
                }
        return arr.length-co;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }
}
