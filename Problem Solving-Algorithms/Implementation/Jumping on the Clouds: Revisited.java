import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int jumpingOnClouds(int[] c, int k) {
        int e=100;
        int x=0;
        while(true)
        {
            x=(x+k)%c.length;
            if(c[x]==0)
            {
                e--;
            }
            else
            {
                e=e-3;
            }
            if(x==0)
            {
                return e;
            }
        }
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c, k);
        System.out.println(result);
        in.close();
    }
}
