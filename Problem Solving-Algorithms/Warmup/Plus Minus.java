import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr,int n) {
        double a=0.0,b=0.0,c=0.0;
        for(int x=0;x<n;x++)
        {
            if(arr[x]>0)
                a++;
            else if(arr[x]<0)
                b++;
            else
                c++;
            
        }
        System.out.println(a/n+"\n"+b/n+"\n"+c/n);
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr,n);
        in.close();
    }
}
