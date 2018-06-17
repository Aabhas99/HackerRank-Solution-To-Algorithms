import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int beautifulDays(int i, int j, int k) {
        int c=0;
        for(int x=i;x<=j;x++)
        {
            int a=x;
            int s=0;
            while(a>0)
            {
                s=s*10+a%10;
                a/=10;
            }
            if(Math.abs(s-x)%k==0)
            {
                c++;
            }
           
        }
         return c;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
