import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int flatlandSpaceStations(int n, int[] c) {
        int i=0;
        int max=0;
        int co=0;
        Arrays.sort(c);
        for(int x=0;x<c.length;x++)
        {
            if(x==0)
            {
                co=c[x];
                if(co>max)
                {
                    max=co;
                }
            }
            if(x==c.length-1)
            {
                co=n-1-c[x];
                if(co>max)
                {
                    max=co;
                }
            }
            if(x<c.length-1)
            {
                int d=(c[x]+c[x+1])/2;
                co=d-c[x];
                if(co>max)
                {
                    max=co;
                }
            }
        }
        return max;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[m];
        for(int c_i = 0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = flatlandSpaceStations(n, c);
        System.out.println(result);
        in.close();
    }
}
