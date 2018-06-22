import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the matrixRotation function below.
    static void matrixRotation(int[][] matrix,int ra) {
        int r=matrix.length;
        int c=matrix[0].length;
        int rb=r;
        int ca=c;
        int m=Math.min(r,c);
        for(int z=1;z<=m/2;z++)
        {
            int q=2*(ca+rb-2);
            int ra1=ra%q;
            for(int y=1;y<=ra1;y++)
            {
                int a=matrix[z-1][z-1];
                for(int x=0+z-1;x<c-z;x++)
                {
                    matrix[z-1][x]=matrix[z-1][x+1];
                }
                for(int x=z-1;x<r-z;x++)
                {
                    matrix[x][c-z]=matrix[x+1][c-z];
                }
                for(int x=c-z;x>=z;x--)
                {
                    matrix[r-z][x]=matrix[r-z][x-1];
                }
                for(int x=r-z;x>=z+1;x--)
                {
                    matrix[x][z-1]=matrix[x-1][z-1];
                }
                matrix[z][z-1]=a;
            }
            rb=rb-2;
            ca=ca-2;
        }
        for(int x=0;x<r;x++)
        {
            for(int y=0;y<c;y++)
            {
                System.out.print(matrix[x][y]+" ");
            }
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mnr = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mnr[0]);

        int n = Integer.parseInt(mnr[1]);

        int r = Integer.parseInt(mnr[2]);

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            String[] matrixRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int matrixItem = Integer.parseInt(matrixRowItems[j]);
                matrix[i][j] = matrixItem;
            }
        }

        matrixRotation(matrix,r);

        scanner.close();
    }
}
