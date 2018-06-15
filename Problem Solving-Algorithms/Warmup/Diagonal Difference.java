import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a,int n) {
        int ar=0,b=0,c=0;
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<n;y++)
            {
                if(x==y)
                {
                    ar=ar+a[x][x];
                }
                if((x+y)==(n-1))
                {
                    b=b+a[x][y];
                }
            }
        }
            c=Math.abs(ar-b);
        return c;// Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a,n);
        System.out.println(result);
        in.close();
    }
}
