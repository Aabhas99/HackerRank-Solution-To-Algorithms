import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        int c=0,f=0;
        for(int x=a[a.length-1];x<=b[b.length-1];x++)
        {
            f=0;
            for(int y=0;y<a.length;y++)
            {
                if(x%a[y]!=0)
                {
                    f++;
                    break;
                }
            }
            for(int y=0;y<b.length;y++)
            {
                if(b[y]%x!=0)
                {
                    f++;
                    break;
                }
            }
            if(f==0)
            {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
