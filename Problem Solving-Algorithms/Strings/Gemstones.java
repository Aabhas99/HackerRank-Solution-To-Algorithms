import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int gemstones(String[] arr){
        int c=0;
        int i=-1;
        int ar[]=new int[arr[0].length()];
        for(int x=0;x<arr[0].length();x++)
        {
            int f=0;
            for(int y=0;y<arr.length;y++)
            {
                String s=""+arr[0].charAt(x);
                if(!(arr[y].contains(s)))
                {
                    f++;
                    break;
                }
            }
            if(f==0)
            {
                int q=0;
                for(int y=0;y<=i;y++)
                {
                    if(ar[y]==arr[0].charAt(x))
                    {
                        q++;break;
                    }
                }
                if(q==0)
                {
                    ar[++i]=arr[0].charAt(x);
                    c++;
                }
            }
        }
        return c;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
