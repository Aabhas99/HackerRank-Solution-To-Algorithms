import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int lonelyinteger(int[] a) {
        Arrays.sort(a);
        
        if(a.length==1||a[0]!=a[1])
        {
            return a[0];
        }
        int x=0;
        try
        {
            while(true)
            {
                if(a[x]!=a[x+1])
                {
                    return a[x];
                }
                x=x+2;
            }
        }
        catch(Exception e)
        {
            return a[a.length-1];
        }
    
        
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = lonelyinteger(a);
        System.out.println(result);
    }
}
