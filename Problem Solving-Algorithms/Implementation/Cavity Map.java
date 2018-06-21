import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String[] cavityMap(String[] grid) {
        String ar[]=new String[grid.length];
        ar[0]=grid[0];
        ar[grid.length-1]=grid[grid.length-1];
        for(int x=1;x<=grid.length-2;x++)
        {
            String k="";
            for(int y=1;y<=grid.length-2;y++)
            {
                int a=Integer.parseInt(grid[x].charAt(y)+"");
                if(a>Integer.parseInt(grid[x-1].charAt(y)+"")
                  &&a>Integer.parseInt(grid[x].charAt(y-1)+"")
                  &&a>Integer.parseInt(grid[x].charAt(y+1)+"")
                  &&a>Integer.parseInt(grid[x+1].charAt(y)+""))
                {
                    k=k+"X";
                }
                else
                {
                    k=k+grid[x].charAt(y);   
                }   
            }
            ar[x]=grid[x].charAt(0)+k+grid[x].charAt(grid.length-1);
        }
        return ar;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for(int grid_i = 0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        String[] result = cavityMap(grid);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
