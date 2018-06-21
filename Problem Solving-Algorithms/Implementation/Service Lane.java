import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] width = new int[n];
        for(int width_i = 0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        int[][] cases = new int[t][2];
        for(int cases_i = 0; cases_i < t; cases_i++){
            for(int cases_j = 0; cases_j < 2; cases_j++){
                cases[cases_i][cases_j] = in.nextInt();
            }
        }
        for(int x=0;x<t;x++)
        {
            int c=3;
            for(int y=cases[x][0];y<=cases[x][1];y++)
            {
                if(width[y]<c)
                {
                    c=width[y];
                }
                if(width[y]==1)
                {
                    c=1;
                    System.out.println(1);
                    break;
                }
            }
            if(c!=1)
            {
                System.out.println(c);
            }
        }

        in.close();
    }
}
