import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int toys(int[] w) {
        int c=0;
        Arrays.sort(w);
        for(int x=0;x<w.length;x++)
        {
            int a=w[x];
            c++;
            while(x!=w.length&&w[x]<=a+4)
            {
                x++;
            }
            x--;
        }
        return c;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] w = new int[n];
        for(int w_i = 0; w_i < n; w_i++){
            w[w_i] = in.nextInt();
        }
        int result = toys(w);
        System.out.println(result);
        in.close();
    }
}
