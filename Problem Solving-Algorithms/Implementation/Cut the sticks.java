import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] cutTheSticks(int[] arr) {
        Arrays.sort(arr);
        int k=-1;
        int ar[]=new int[arr.length];
        int i=0;
        while(arr[arr.length-1]!=0)
        {
            while(arr[i]==0)
            {
                i++;
            }
            int a=arr[i];
            int c=0;
            for(int x=i;x<arr.length;x++)
            {
                arr[x]=arr[x]-a;
                c++;
                
            }
            ar[++k]=c;
            
        }
        return ar;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = cutTheSticks(arr);
        for (int i = 0; i < result.length; i++) {
            if(result[i]==0)
            {
                break;
            }
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
