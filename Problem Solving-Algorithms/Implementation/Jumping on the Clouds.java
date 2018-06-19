import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int jumpingOnClouds(int[] c) {
        int co=0;
        int i=0;
        while(i<=c.length-3)
        {
            co++;
            if(c[i+1]==0&&c[i+2]==1)
            {
                i++;
            }
            else
            {
                i+=2;   
            }
        }
       
        if(i==c.length-2)
        {
            return co+1;
        }
        return co;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c);
        System.out.println(result);
        in.close();
    }
}
