import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int pickingNumbers(int[] a) {
        Arrays.sort(a);
        int co=0;
        for(int x=0;x<a.length;x++)
        {
            for(int y=x;y<a.length;y++)
            {
                int c=0;
                int k=a[x];
                for(int z=x+1;z<=y;z++)
                {
                    if(Math.abs(a[z]-k)<=1)
                    {
                        c++;
                    }
                    else
                    {
                        break;
                    }
                }
                if(c==(y-x))
                {
                    if(c>co)
                    {
                        co=c;
                    }
                }
            }
        }
        return co+1;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}
