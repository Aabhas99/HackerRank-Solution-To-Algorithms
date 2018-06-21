import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumDistances(int[] ar) {
        int c=1000;
        for(int x=0;x<ar.length;x++)
        {
            int d=x;
            for(int y=x+1;y<ar.length;y++)
            {
                if(ar[y]==ar[d])
                {
                    d=y;
                    if(Math.abs(x-y)<c)
                    {
                        c=Math.abs(x-y);
                    }
                    if(Math.abs(x-y)==1)
                    {
                        return 1;
                    }
                }
            }
        }
        if(c==1000)
        {
            return -1;
        }
        return c;
        
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = minimumDistances(a);
        System.out.println(result);
        in.close();
    }
}
