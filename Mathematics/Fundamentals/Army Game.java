import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c=0;
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<m;y++)
            {
                c++;
                y++;
            }
            x++;
        }
        System.out.println(c);
    }
}
