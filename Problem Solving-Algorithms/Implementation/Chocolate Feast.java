import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int chocolateFeast(int n, int c, int m) {
        int s=n/c;
        int co=n/c;
        while(co>=m)
        {
            s=s+co/m;
            co=co%m+co/m;
            
        }
        return s;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int result = chocolateFeast(n, c, m);
            System.out.println(result);
        }
        in.close();
    }
}
