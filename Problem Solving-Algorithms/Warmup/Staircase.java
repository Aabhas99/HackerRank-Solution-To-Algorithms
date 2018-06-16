import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
        for(int x=1;x<=n;x++)
        {
            for(int y=n-1;y>=x;y--)
            {
                System.out.print(" ");
            }
            for(int y=1;y<=x;y++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
