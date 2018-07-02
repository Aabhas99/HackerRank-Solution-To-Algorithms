import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long solve(long n, long m){
        return (m*n-1);
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        long result = solve(n, m);
        System.out.println(result);
    }
}
