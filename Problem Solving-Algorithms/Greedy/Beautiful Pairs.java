import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int beautifulPairs(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int k=1;
        int x=0,y=0;
        while(x!=A.length&&y!=B.length)
        {
            int a=0,b=0;
            int r=A[x];
            while(x!=A.length&&A[x]==r)
            {
                    a++;
                    x++;
            }
            while(y!=A.length&&B[y]<r)
            {
                y++;
            }
                while(y!=A.length&&B[y]==r)
                {
                        b++;
                        y++;
                }
            k=k+Math.min(a,b);
        }
        if(Arrays.equals(A,B))
        {
            return k-2;
        }
        return k;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int A_i = 0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int[] B = new int[n];
        for(int B_i = 0; B_i < n; B_i++){
            B[B_i] = in.nextInt();
        }
        int result = beautifulPairs(A, B);
        System.out.println(result);
        in.close();
    }
}
