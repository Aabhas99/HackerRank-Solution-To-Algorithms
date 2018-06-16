import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        int b[]={0,0,0,0,0};
        for(int x=0;x<=4;x++)
        {
            for(int y=0;y<n;y++)
            if(x+1==ar[y])
            {
                b[x]++;
            }
        }
        int l=b[0];
        int k=0;
        for(int x=1;x<=4;x++)
        {
            if(l<b[x])
            {
                l=b[x];
                k=x;
            }
        }
        return k+1;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
