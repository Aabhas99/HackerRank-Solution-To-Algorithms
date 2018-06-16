import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        long s=0l;
        for(int x=0;x<5;x++)
        {
            s=s+arr[x];
        }
        long l=s;
        long la=s-arr[0];
        for(int x=0;x<5;x++)
        {
            if(s-arr[x]<l)
                l=s-arr[x];
            if(s-arr[x]>la)
                la=s-arr[x];
                
        }
        System.out.println(l+" "+la);
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
