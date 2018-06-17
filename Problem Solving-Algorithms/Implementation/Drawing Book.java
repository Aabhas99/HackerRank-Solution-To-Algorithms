import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        int a=0,b=0;
        if(p%2==0)
        {
            a=p/2;
            b=n/2-a;
        }
        else
        {
            a=(p-1)/2;
            b=n/2-a;
        }
        return a<b?a:b;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
