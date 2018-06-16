import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] appleAndOrange(int s, int t, int a, int b, int[] apple, int[] orange) {
        int p=0,q=0,ar[]=new int[2];
        for(int x=0;x<apple.length;x++)
        {
            if(apple[x]>0)
            {
                if((a+apple[x])>=s&&(a+apple[x])<=t)
                {
                    p++;
                }
            }
        }
        for(int x=0;x<orange.length;x++)
        {
            if(orange[x]<0)
            {
                if((b+orange[x])>=s&&(b+orange[x])<=t)
                {
                    q++;
                }
            }
        }
        ar[0]=p;
        ar[1]=q;
        return ar;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int[] result = appleAndOrange(s, t, a, b, apple, orange);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
