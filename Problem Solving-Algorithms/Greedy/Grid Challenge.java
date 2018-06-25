import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String gridChallenge(String[] grid) {
        for(int x=0;x<grid.length;x++)
        {
            char ar[]=grid[x].toCharArray();
            Arrays.sort(ar);
            grid[x]=new String(ar);
        }
        for(int x=0;x<grid.length;x++)
        {
            for(int y=0;y<grid.length-1;y++)
            {
                if(grid[y].charAt(x)>grid[y+1].charAt(x))
                {
                    return "NO";
                }
            }
        }
        return "YES";
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int x=0;x<t;x++)
        {
        int n = in.nextInt();
        String[] grid = new String[n];
        for(int grid_i = 0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        String result = gridChallenge(grid);
        System.out.println(result);
        }
        in.close();
    }
}
