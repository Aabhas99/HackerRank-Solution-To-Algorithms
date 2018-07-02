import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String canConstruct(int[] a) {
        long s=0l;
        for(int x=0;x<a.length;x++)
        {
           
            s=s+a[x];
        }
        if(s%3==0)
        {
            return "Yes";
        }
        return "No";
        // Return "Yes" or "No" denoting whether you can construct the required number.
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = canConstruct(a);
            System.out.println(result);
        }
        in.close();
    }
}
