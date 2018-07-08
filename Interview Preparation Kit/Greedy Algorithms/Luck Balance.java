import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long luckBalance(int n, int k, int[][] contests) {
        int ar[]=new int[n];
        int i=-1;
        long s=0l;
        for(int x=0;x<n;x++)
        {
            if(contests[x][1]==1)
            {
                ar[++i]=contests[x][0];
            }
            s=s+contests[x][0];
            
        }
        Arrays.sort(ar);
        for(int x=0;x<=i-k;x++)
        {
            s=s-2*ar[n-1-i+x];
        }
        return s;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[][] contests = new int[n][2];
        for(int contests_i = 0; contests_i < n; contests_i++){
            for(int contests_j = 0; contests_j < 2; contests_j++){
                contests[contests_i][contests_j] = in.nextInt();
            }
        }
        long result = luckBalance(n, k, contests);
        System.out.println(result);
        in.close();
    }
}
