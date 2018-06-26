import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String twoArrays(int k, int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        for(int x=0;x<A.length;x++)
        {
            if(A[x]+B[A.length-1-x]<k)
            {
                return "NO";
            }
        }
        return "YES";
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] A = new int[n];
            for(int A_i = 0; A_i < n; A_i++){
                A[A_i] = in.nextInt();
            }
            int[] B = new int[n];
            for(int B_i = 0; B_i < n; B_i++){
                B[B_i] = in.nextInt();
            }
            String result = twoArrays(k, A, B);
            System.out.println(result);
        }
        in.close();
    }
}
