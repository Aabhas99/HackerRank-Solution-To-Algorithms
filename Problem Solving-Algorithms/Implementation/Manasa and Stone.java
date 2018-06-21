import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void stones(int n, int a, int b) {
        int c=a<b?a:b;
        int d=a>b?a:b;
        if(c==d)
        {
            int s=0;
            for(int x=0;x<n-1;x++)
            {
                s=s+c;
            }
            System.out.print(s);
            return;
        }
        List<Integer> ar=new ArrayList<>();
        for(int x=0;x<n;x++)
        {
            int s=0;
            for(int y=0;y<x;y++)
            {
                s=s+d;
            }
            for(int y=x+1;y<n;y++)
            {
                s=s+c;
            }
            ar.add(s);
        }
        for(Integer a1:ar)
        {
            System.out.print(a1+" ");
        }
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            stones(n, a, b);
            
            System.out.println("");


        }
        in.close();
    }
}
